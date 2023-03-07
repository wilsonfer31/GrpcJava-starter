package com.wf.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "convert",
      requestType = com.wf.stubs.User.AgeUserRequest.class,
      responseType = com.wf.stubs.User.AgeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getConvertMethod() {
    io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse> getConvertMethod;
    if ((getConvertMethod = UserServiceGrpc.getConvertMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getConvertMethod = UserServiceGrpc.getConvertMethod) == null) {
          UserServiceGrpc.getConvertMethod = getConvertMethod = 
              io.grpc.MethodDescriptor.<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("convert"))
                  .build();
          }
        }
     }
     return getConvertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getGetAgeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAgeStream",
      requestType = com.wf.stubs.User.AgeUserRequest.class,
      responseType = com.wf.stubs.User.AgeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getGetAgeStreamMethod() {
    io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse> getGetAgeStreamMethod;
    if ((getGetAgeStreamMethod = UserServiceGrpc.getGetAgeStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAgeStreamMethod = UserServiceGrpc.getGetAgeStreamMethod) == null) {
          UserServiceGrpc.getGetAgeStreamMethod = getGetAgeStreamMethod = 
              io.grpc.MethodDescriptor.<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getAgeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getAgeStream"))
                  .build();
          }
        }
     }
     return getGetAgeStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getDoAgeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doAgeStream",
      requestType = com.wf.stubs.User.AgeUserRequest.class,
      responseType = com.wf.stubs.User.AgeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getDoAgeStreamMethod() {
    io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse> getDoAgeStreamMethod;
    if ((getDoAgeStreamMethod = UserServiceGrpc.getDoAgeStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDoAgeStreamMethod = UserServiceGrpc.getDoAgeStreamMethod) == null) {
          UserServiceGrpc.getDoAgeStreamMethod = getDoAgeStreamMethod = 
              io.grpc.MethodDescriptor.<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "doAgeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("doAgeStream"))
                  .build();
          }
        }
     }
     return getDoAgeStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getFullAgeStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fullAgeStream",
      requestType = com.wf.stubs.User.AgeUserRequest.class,
      responseType = com.wf.stubs.User.AgeUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest,
      com.wf.stubs.User.AgeUserResponse> getFullAgeStreamMethod() {
    io.grpc.MethodDescriptor<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse> getFullAgeStreamMethod;
    if ((getFullAgeStreamMethod = UserServiceGrpc.getFullAgeStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getFullAgeStreamMethod = UserServiceGrpc.getFullAgeStreamMethod) == null) {
          UserServiceGrpc.getFullAgeStreamMethod = getFullAgeStreamMethod = 
              io.grpc.MethodDescriptor.<com.wf.stubs.User.AgeUserRequest, com.wf.stubs.User.AgeUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "fullAgeStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wf.stubs.User.AgeUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("fullAgeStream"))
                  .build();
          }
        }
     }
     return getFullAgeStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void convert(com.wf.stubs.User.AgeUserRequest request,
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    /**
     */
    public void getAgeStream(com.wf.stubs.User.AgeUserRequest request,
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAgeStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserRequest> doAgeStream(
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDoAgeStreamMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserRequest> fullAgeStream(
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFullAgeStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wf.stubs.User.AgeUserRequest,
                com.wf.stubs.User.AgeUserResponse>(
                  this, METHODID_CONVERT)))
          .addMethod(
            getGetAgeStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.wf.stubs.User.AgeUserRequest,
                com.wf.stubs.User.AgeUserResponse>(
                  this, METHODID_GET_AGE_STREAM)))
          .addMethod(
            getDoAgeStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.wf.stubs.User.AgeUserRequest,
                com.wf.stubs.User.AgeUserResponse>(
                  this, METHODID_DO_AGE_STREAM)))
          .addMethod(
            getFullAgeStreamMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.wf.stubs.User.AgeUserRequest,
                com.wf.stubs.User.AgeUserResponse>(
                  this, METHODID_FULL_AGE_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void convert(com.wf.stubs.User.AgeUserRequest request,
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAgeStream(com.wf.stubs.User.AgeUserRequest request,
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAgeStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserRequest> doAgeStream(
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDoAgeStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserRequest> fullAgeStream(
        io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFullAgeStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wf.stubs.User.AgeUserResponse convert(com.wf.stubs.User.AgeUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.wf.stubs.User.AgeUserResponse> getAgeStream(
        com.wf.stubs.User.AgeUserRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAgeStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wf.stubs.User.AgeUserResponse> convert(
        com.wf.stubs.User.AgeUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CONVERT = 0;
  private static final int METHODID_GET_AGE_STREAM = 1;
  private static final int METHODID_DO_AGE_STREAM = 2;
  private static final int METHODID_FULL_AGE_STREAM = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONVERT:
          serviceImpl.convert((com.wf.stubs.User.AgeUserRequest) request,
              (io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse>) responseObserver);
          break;
        case METHODID_GET_AGE_STREAM:
          serviceImpl.getAgeStream((com.wf.stubs.User.AgeUserRequest) request,
              (io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse>) responseObserver);
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
        case METHODID_DO_AGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.doAgeStream(
              (io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse>) responseObserver);
        case METHODID_FULL_AGE_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.fullAgeStream(
              (io.grpc.stub.StreamObserver<com.wf.stubs.User.AgeUserResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wf.stubs.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getConvertMethod())
              .addMethod(getGetAgeStreamMethod())
              .addMethod(getDoAgeStreamMethod())
              .addMethod(getFullAgeStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
