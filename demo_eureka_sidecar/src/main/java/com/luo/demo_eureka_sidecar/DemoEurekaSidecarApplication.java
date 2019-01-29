package com.luo.demo_eureka_sidecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableSidecar
public class DemoEurekaSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaSidecarApplication.class, args);
	}

}

