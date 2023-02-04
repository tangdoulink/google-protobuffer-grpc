package com.zpb.proto.grpc.rpc;

import com.zpb.protobuf.message.hello.Hello;
import com.zpb.protobuf.message.hello.HelloRequest;
import com.zpb.protobuf.message.hello.HelloResponse;
import com.zpb.protobuf.message.hello.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author       pengbo.zhao
 * @description  hello-service-grpc
 * @createDate   2021/12/21 19:48
 * @updateDate   2021/12/21 19:48
 * @version      1.0
 */

public class HelloServiceGrpcImpl extends HelloServiceGrpc.HelloServiceImplBase {

    static List<Hello> helloList = new ArrayList<>();

    static {

        helloList.add(Hello.newBuilder().setId(1).setName("张三").setAge(23).setAddress("北京昌平").build());
        helloList.add(Hello.newBuilder().setId(2).setName("李四").setAge(24).setAddress("北京朝阳").build());

    }

    @Override
    public void sayHello1(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        System.err.println("客户端："+request.getName() +" 发送请求");

        // 创建响应对象
        String message = " hello "+request.getName() + ", 现在是北京时间："+ LocalDateTime.now();
        HelloResponse helloResponse = HelloResponse.newBuilder().setMessage(message).build();

        // 返回响应消息
        responseObserver.onNext(helloResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void sayHello2(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.err.println("客户端："+request.getName() +" 发送请求");
        helloList.forEach(hello -> {
            String message = " hello "+ hello.getName() + ", 现在是北京时间："+ LocalDateTime.now();
            responseObserver.onNext(HelloResponse.newBuilder().setMessage(message).build());
        });
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<HelloRequest> sayHello3(StreamObserver<HelloResponse> responseObserver) {
        return new StreamObserver<HelloRequest>(){

            String requestName;
            final StringBuilder sb = new StringBuilder();
            @Override
            public void onNext(HelloRequest helloRequest) {
                System.err.println("客户端："+helloRequest.getName() +" 发送请求");
                sb.append(helloRequest.getName()).append(" ");
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("客户端："+ requestName+" 发送请求，处理失败: "+throwable);
            }

            @Override
            public void onCompleted() {
                String message = "sayHello3---------------客户端发送请求完成!!!";
                System.err.println(message);

                // 当客户端的流发送完成后，需要写回到服务端，由服务端进行处理
                responseObserver.onNext(HelloResponse.newBuilder().setMessage(sb.toString()).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<HelloRequest> sayHello4(StreamObserver<HelloResponse> responseObserver) {

        return new StreamObserver<HelloRequest>(){

            String requestName;
            final List<String> responseList = new ArrayList<>();
            @Override
            public void onNext(HelloRequest helloRequest) {
                requestName = helloRequest.getName();
                String message = " hello "+ requestName + ", 现在是北京时间："+ LocalDateTime.now();
                responseList.add(message);
                System.err.println("客户端："+helloRequest.getName() +" 发送请求");
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println("客户端："+ requestName+" 发送请求，处理失败: "+throwable);
            }

            @Override
            public void onCompleted() {
                System.err.println("客户端：发送请求，处理完成 ");

                // 将客户端发送完成的流发送给服务端处理
                responseList.forEach(message -> {
                    responseObserver.onNext(HelloResponse.newBuilder().setMessage(message).build());
                });
                responseObserver.onCompleted();
            }
        };
    }
}
