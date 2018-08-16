package com.eurake.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动一个服务注册中心，只需要一个注解@EnableEurekaServer，这个注解需要在springboot工程的启动application类上加：
 */
@SpringBootApplication
@EnableEurekaServer
public class EurakeServer0Application {

	public static void main(String[] args) {
		SpringApplication.run(EurakeServer0Application.class, args);
	}
}
