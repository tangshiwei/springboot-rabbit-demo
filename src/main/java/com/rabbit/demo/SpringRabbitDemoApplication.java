package com.rabbit.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/***
 * rabbitMQ的web页面管理http://192.168.1.110:15672
 */
@SpringBootApplication
public class SpringRabbitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRabbitDemoApplication.class, args);
    }

}
