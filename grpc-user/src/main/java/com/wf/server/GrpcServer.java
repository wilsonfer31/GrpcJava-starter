package com.wf.server;

import com.wf.services.UserGrpcService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(5051).addService(new UserGrpcService()).build();

        server.start();
        server.awaitTermination();
    }
}
