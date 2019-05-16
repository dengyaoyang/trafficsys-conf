package com.cecgw.cq.trafficsys.trafficsysconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;


@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class TrafficsysConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrafficsysConfApplication.class, args);
    }

}
