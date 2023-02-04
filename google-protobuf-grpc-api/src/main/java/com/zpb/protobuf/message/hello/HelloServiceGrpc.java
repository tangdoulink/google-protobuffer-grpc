package com.zpb.protobuf.message.hello;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * rpc 接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: hello.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HelloServiceGrpc {

  private HelloServiceGrpc() {}

  public static final String SERVICE_NAME = "com.zpb.protobuf.message.hello.HelloService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello1Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello1",
      requestType = com.zpb.protobuf.message.hello.HelloRequest.class,
      responseType = com.zpb.protobuf.message.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello1Method() {
    io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse> getSayHello1Method;
    if ((getSayHello1Method = HelloServiceGrpc.getSayHello1Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSayHello1Method = HelloServiceGrpc.getSayHello1Method) == null) {
          HelloServiceGrpc.getSayHello1Method = getSayHello1Method =
              io.grpc.MethodDescriptor.<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello1"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("sayHello1"))
              .build();
        }
      }
    }
    return getSayHello1Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello2",
      requestType = com.zpb.protobuf.message.hello.HelloRequest.class,
      responseType = com.zpb.protobuf.message.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello2Method() {
    io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse> getSayHello2Method;
    if ((getSayHello2Method = HelloServiceGrpc.getSayHello2Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSayHello2Method = HelloServiceGrpc.getSayHello2Method) == null) {
          HelloServiceGrpc.getSayHello2Method = getSayHello2Method =
              io.grpc.MethodDescriptor.<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("sayHello2"))
              .build();
        }
      }
    }
    return getSayHello2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello3",
      requestType = com.zpb.protobuf.message.hello.HelloRequest.class,
      responseType = com.zpb.protobuf.message.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello3Method() {
    io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse> getSayHello3Method;
    if ((getSayHello3Method = HelloServiceGrpc.getSayHello3Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSayHello3Method = HelloServiceGrpc.getSayHello3Method) == null) {
          HelloServiceGrpc.getSayHello3Method = getSayHello3Method =
              io.grpc.MethodDescriptor.<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("sayHello3"))
              .build();
        }
      }
    }
    return getSayHello3Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sayHello4",
      requestType = com.zpb.protobuf.message.hello.HelloRequest.class,
      responseType = com.zpb.protobuf.message.hello.HelloResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest,
      com.zpb.protobuf.message.hello.HelloResponse> getSayHello4Method() {
    io.grpc.MethodDescriptor<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse> getSayHello4Method;
    if ((getSayHello4Method = HelloServiceGrpc.getSayHello4Method) == null) {
      synchronized (HelloServiceGrpc.class) {
        if ((getSayHello4Method = HelloServiceGrpc.getSayHello4Method) == null) {
          HelloServiceGrpc.getSayHello4Method = getSayHello4Method =
              io.grpc.MethodDescriptor.<com.zpb.protobuf.message.hello.HelloRequest, com.zpb.protobuf.message.hello.HelloResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHello4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.zpb.protobuf.message.hello.HelloResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloServiceMethodDescriptorSupplier("sayHello4"))
              .build();
        }
      }
    }
    return getSayHello4Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceStub>() {
        @java.lang.Override
        public HelloServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceStub(channel, callOptions);
        }
      };
    return HelloServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceBlockingStub>() {
        @java.lang.Override
        public HelloServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceBlockingStub(channel, callOptions);
        }
      };
    return HelloServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloServiceFutureStub>() {
        @java.lang.Override
        public HelloServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloServiceFutureStub(channel, callOptions);
        }
      };
    return HelloServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * rpc 接口
   * </pre>
   */
  public static abstract class HelloServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 普通 rpc 接口
     * </pre>
     */
    public void sayHello1(com.zpb.protobuf.message.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHello1Method(), responseObserver);
    }

    /**
     * <pre>
     * 服务器端流传输的RPC
     * </pre>
     */
    public void sayHello2(com.zpb.protobuf.message.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHello2Method(), responseObserver);
    }

    /**
     * <pre>
     * 客户端流传输的RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloRequest> sayHello3(
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHello3Method(), responseObserver);
    }

    /**
     * <pre>
     * 双向流RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloRequest> sayHello4(
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSayHello4Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHello1Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.zpb.protobuf.message.hello.HelloRequest,
                com.zpb.protobuf.message.hello.HelloResponse>(
                  this, METHODID_SAY_HELLO1)))
          .addMethod(
            getSayHello2Method(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.zpb.protobuf.message.hello.HelloRequest,
                com.zpb.protobuf.message.hello.HelloResponse>(
                  this, METHODID_SAY_HELLO2)))
          .addMethod(
            getSayHello3Method(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.zpb.protobuf.message.hello.HelloRequest,
                com.zpb.protobuf.message.hello.HelloResponse>(
                  this, METHODID_SAY_HELLO3)))
          .addMethod(
            getSayHello4Method(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.zpb.protobuf.message.hello.HelloRequest,
                com.zpb.protobuf.message.hello.HelloResponse>(
                  this, METHODID_SAY_HELLO4)))
          .build();
    }
  }

  /**
   * <pre>
   * rpc 接口
   * </pre>
   */
  public static final class HelloServiceStub extends io.grpc.stub.AbstractAsyncStub<HelloServiceStub> {
    private HelloServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通 rpc 接口
     * </pre>
     */
    public void sayHello1(com.zpb.protobuf.message.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHello1Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 服务器端流传输的RPC
     * </pre>
     */
    public void sayHello2(com.zpb.protobuf.message.hello.HelloRequest request,
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSayHello2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 客户端流传输的RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloRequest> sayHello3(
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSayHello3Method(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * 双向流RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloRequest> sayHello4(
        io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSayHello4Method(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * rpc 接口
   * </pre>
   */
  public static final class HelloServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloServiceBlockingStub> {
    private HelloServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通 rpc 接口
     * </pre>
     */
    public com.zpb.protobuf.message.hello.HelloResponse sayHello1(com.zpb.protobuf.message.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHello1Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 服务器端流传输的RPC
     * </pre>
     */
    public java.util.Iterator<com.zpb.protobuf.message.hello.HelloResponse> sayHello2(
        com.zpb.protobuf.message.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSayHello2Method(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * rpc 接口
   * </pre>
   */
  public static final class HelloServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HelloServiceFutureStub> {
    private HelloServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 普通 rpc 接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.zpb.protobuf.message.hello.HelloResponse> sayHello1(
        com.zpb.protobuf.message.hello.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHello1Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO1 = 0;
  private static final int METHODID_SAY_HELLO2 = 1;
  private static final int METHODID_SAY_HELLO3 = 2;
  private static final int METHODID_SAY_HELLO4 = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO1:
          serviceImpl.sayHello1((com.zpb.protobuf.message.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse>) responseObserver);
          break;
        case METHODID_SAY_HELLO2:
          serviceImpl.sayHello2((com.zpb.protobuf.message.hello.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO3:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHello3(
              (io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse>) responseObserver);
        case METHODID_SAY_HELLO4:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHello4(
              (io.grpc.stub.StreamObserver<com.zpb.protobuf.message.hello.HelloResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.zpb.protobuf.message.hello.HelloOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloService");
    }
  }

  private static final class HelloServiceFileDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier {
    HelloServiceFileDescriptorSupplier() {}
  }

  private static final class HelloServiceMethodDescriptorSupplier
      extends HelloServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HelloServiceFileDescriptorSupplier())
              .addMethod(getSayHello1Method())
              .addMethod(getSayHello2Method())
              .addMethod(getSayHello3Method())
              .addMethod(getSayHello4Method())
              .build();
        }
      }
    }
    return result;
  }
}
