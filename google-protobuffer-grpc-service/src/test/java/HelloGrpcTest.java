import com.zpb.proto.grpc.rpc.HelloServiceGrpcImpl;
import com.zpb.proto.grpc.util.GrpcUtil;
import com.zpb.protobuf.message.hello.HelloRequest;
import com.zpb.protobuf.message.hello.HelloResponse;
import com.zpb.protobuf.message.hello.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Server;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Iterator;

/**
 * @author       pengbo.zhao
 * @description  hello-grpc-test
 * @createDate   2021/12/21 20:46
 * @updateDate   2021/12/21 20:46
 * @version      1.0
 */
@DisplayName("hello-grpc-test")
public class HelloGrpcTest {

    @Test
    @DisplayName("启动grpc服务")
    public void startGrpc() throws IOException, InterruptedException {
        Server server = GrpcUtil.startGrpcService(18257, new HelloServiceGrpcImpl());
        GrpcUtil.blockUntilShutdown(server);
    }

    @Test
    @DisplayName("普通grpc")
    public void testSayHello1(){

        // 订阅 grpc 服务
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 18257).usePlaintext().build();

        // 创建调用存根
        HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub = HelloServiceGrpc.newBlockingStub(channel);

        // 生成请求对象
        HelloRequest helloRequest = HelloRequest.newBuilder().setId(1).setName("张三").setAge(23).build();

        // 获取响应结果
        HelloResponse helloResponse = helloServiceBlockingStub.sayHello1(helloRequest);
        System.err.println(" grpc 服务端响应的数据是："+helloResponse.getMessage());

    }

    @Test
    @DisplayName("服务端流rpc")
    public void testSayHello2(){

        // 订阅 grpc 服务
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 18257).usePlaintext().build();
        HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub = HelloServiceGrpc.newBlockingStub(channel);

        // 生成请求对象
        HelloRequest helloRequest = HelloRequest.newBuilder().setId(1).setName("李四").setAge(23).build();

        // 获取响应结果
        Iterator<HelloResponse> helloResponseIterator = helloServiceBlockingStub.sayHello2(helloRequest);
        while (helloResponseIterator.hasNext()){
            HelloResponse helloResponse = helloResponseIterator.next();
            System.err.println(" grpc 服务端响应的数据是："+ helloResponse.getMessage());
        }

    }

    @Test
    @DisplayName("客户端流rpc")
    public void testSayHello3() throws InterruptedException {

        // 订阅 grpc 服务
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 18257).usePlaintext().build();

        // 创建异步存根
        HelloServiceGrpc.HelloServiceStub helloServiceStub = HelloServiceGrpc.newStub(channel);

        // 服务端的处理方式
        StreamObserver<HelloResponse> responseStreamObserver = new StreamObserver<HelloResponse>() {

            @Override
            public void onNext(HelloResponse helloResponse) {

                // 当客户端请求完成时，会在这里处理客户端的请求
                System.err.println("onNext---------------服务端：" + helloResponse.getMessage());

            }

            @Override
            public void onError(Throwable throwable) {

                // 当客户端请求时，处理异常情况
                System.err.println("onError---------------服务端响应信息失败：" + throwable);

            }

            @Override
            public void onCompleted() {

                // 当服务端处理完成时，会执行此方法
                System.err.println("onCompleted---------------服务端处理完成");

            }

        };

        StreamObserver<HelloRequest> helloRequestStreamObserver = helloServiceStub.sayHello3(responseStreamObserver);

        // 请求体-集合
        helloRequestStreamObserver.onNext(HelloRequest.newBuilder().setName("王五").build());
        helloRequestStreamObserver.onNext(HelloRequest.newBuilder().setName("马六").build());
        helloRequestStreamObserver.onCompleted();

        // 休眠10s
        Thread.sleep(10000L);

    }



    @Test
    @DisplayName("双向流rpc")
    public void testSayHello4() throws InterruptedException {

        // 订阅 grpc 服务
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 18257).usePlaintext().build();

        // 异步存根
        HelloServiceGrpc.HelloServiceStub helloServiceStub = HelloServiceGrpc.newStub(channel);

        // 服务端的处理方式
        StreamObserver<HelloResponse> responseStreamObserver = new StreamObserver<HelloResponse>() {

            @Override
            public void onNext(HelloResponse helloResponse) {

                // 当客户端请求完成时，会在这里处理客户端的请求
                System.err.println("onNext---------------服务端：" + helloResponse.getMessage());

            }

            @Override
            public void onError(Throwable throwable) {

                // 当客户端请求时，处理异常情况
                System.err.println("onError---------------服务端响应信息失败：" + throwable);

            }

            @Override
            public void onCompleted() {

                // 当服务端处理完成时，会执行此方法
                System.err.println("onCompleted---------------服务端处理完成");

            }

        };

        StreamObserver<HelloRequest> helloRequestStreamObserver = helloServiceStub.sayHello4(responseStreamObserver);

        // 请求体-集合
        helloRequestStreamObserver.onNext(HelloRequest.newBuilder().setName("田七").build());
        helloRequestStreamObserver.onNext(HelloRequest.newBuilder().setName("周八").build());
        helloRequestStreamObserver.onCompleted();

        // 休眠10s
        Thread.sleep(10000L);

    }

}
