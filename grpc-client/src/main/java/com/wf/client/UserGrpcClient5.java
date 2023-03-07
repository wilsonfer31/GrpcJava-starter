package com.wf.client;

import com.wf.stubs.User;
import com.wf.stubs.UserServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

//BiDirectionStreaming
public class UserGrpcClient5 {
    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5051).usePlaintext().build();

        UserServiceGrpc.UserServiceStub asyncStub = UserServiceGrpc.newStub(channel);



        StreamObserver<User.AgeUserRequest> doAgeStream = asyncStub.fullAgeStream(new StreamObserver<User.AgeUserResponse>() {
            @Override
            public void onNext(User.AgeUserResponse ageUserResponse) {
                System.out.println("---------------");
                System.out.println(ageUserResponse);
                System.out.println("---------------");
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                System.out.println("end");
            }
        });
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int count =0;
            @Override
            public void run() {
                User.AgeUserRequest request =  User.AgeUserRequest.newBuilder().setName("JEAN").setBornYear(2015).build();
                doAgeStream.onNext(request);
                System.out.println("count: =" +count);
                ++count;

                if (count == 10) {
                    doAgeStream.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);


        System.out.println("---");
        System.in.read();
    }
}
