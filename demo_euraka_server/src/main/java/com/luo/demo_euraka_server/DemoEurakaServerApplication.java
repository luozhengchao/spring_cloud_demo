package com.luo.demo_euraka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurakaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurakaServerApplication.class, args);
    }

}

