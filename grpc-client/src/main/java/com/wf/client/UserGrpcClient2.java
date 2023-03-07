package com.wf.client;

import com.wf.stubs.User;
import com.wf.stubs.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
//UnicarryCall Not Blocking
public class UserGrpcClient2 {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5051).usePlaintext().build();

        UserServiceGrpc.UserServiceStub asyncStub = UserServiceGrpc.newStub(channel);
        User.AgeUserRequest request =  User.AgeUserRequest.newBuilder().setName("JEAN").setBornYear(2015).build();
        asyncStub.convert(request, new StreamObserver<User.AgeUserResponse>() {
            @Override
            public void onNext(User.AgeUserResponse ageUserResponse) {
                System.out.println(ageUserResponse);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed!");

            }
        });
        System.out.println("---");
        System.in.read();
    }
}
