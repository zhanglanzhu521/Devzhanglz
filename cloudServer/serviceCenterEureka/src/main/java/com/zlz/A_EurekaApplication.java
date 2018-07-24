package com.zlz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class A_EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(A_EurekaApplication.class, args);
    }
}
