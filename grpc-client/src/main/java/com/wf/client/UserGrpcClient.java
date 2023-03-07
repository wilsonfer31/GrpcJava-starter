package com.wf.client;

import com.wf.stubs.User;
import com.wf.stubs.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
//UnicarryCall Blocking
public class UserGrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5051).usePlaintext().build();

        UserServiceGrpc.UserServiceBlockingStub blockingStub = UserServiceGrpc.newBlockingStub(channel);
        User.AgeUserRequest request =  User.AgeUserRequest.newBuilder().setName("JEAN").setBornYear(2015).build();
        User.AgeUserResponse userResponse =  blockingStub.convert(request);
        System.out.println(userResponse);

    }
}
