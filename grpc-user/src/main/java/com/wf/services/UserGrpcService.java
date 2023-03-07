package com.wf.services;

import com.wf.stubs.User;
import com.wf.stubs.UserServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.time.Year;
import java.util.Currency;
import java.util.Timer;
import java.util.TimerTask;

public class UserGrpcService extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void convert(User.AgeUserRequest request, StreamObserver<User.AgeUserResponse> responseObserver) {
        String name = request.getName();
        int bornYear = request.getBornYear();

        User.AgeUserResponse response = User.AgeUserResponse.newBuilder().setName(name).setBornYear(bornYear).setAge(Year.now().getValue() - bornYear).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }


    @Override
    public void getAgeStream(User.AgeUserRequest request, StreamObserver<User.AgeUserResponse> responseObserver) {
        String name = request.getName();
        int bornYear = request.getBornYear();

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                responseObserver.onNext(User.AgeUserResponse.newBuilder().setName(name).setBornYear(bornYear).setAge(Year.now().getValue()- bornYear ).build());
                ++count;
                if(count == 20) {
                    responseObserver.onCompleted();
                    timer.cancel();
                }
            }
        }, 1000, 1000);

    }


    @Override
    public StreamObserver<User.AgeUserRequest> doAgeStream(StreamObserver<User.AgeUserResponse> responseObserver) {
        return new StreamObserver<User.AgeUserRequest>() {
            int bornYearMinus10 = 0;

            @Override
            public void onNext(User.AgeUserRequest ageUserRequest) {
                bornYearMinus10 = ageUserRequest.getBornYear() - 10;            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onCompleted() {
                User.AgeUserResponse response = User.AgeUserResponse.newBuilder().setName("Jean").setBornYear(bornYearMinus10).setAge(Year.now().getValue() - bornYearMinus10).build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();

            }
        };
    }


    @Override
    public StreamObserver<User.AgeUserRequest> fullAgeStream(StreamObserver<User.AgeUserResponse> responseObserver) {
        return  new StreamObserver<User.AgeUserRequest>() {
            @Override
            public void onNext(User.AgeUserRequest ageUserRequest) {
               User.AgeUserResponse response = User.AgeUserResponse.newBuilder().setName(ageUserRequest.getName()).setBornYear(ageUserRequest.getBornYear()).setAge(Year.now().getValue() - ageUserRequest.getBornYear()).build();
                responseObserver.onNext(response);

            }

            @Override
            public void onError(Throwable throwable) {
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();

            }
        };
    }
}
