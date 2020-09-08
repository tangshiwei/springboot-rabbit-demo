package com.rabbit.demo.message;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"fanout.A","fanout.B","fanout.C"})
public class FanoutReceiver {

    @RabbitHandler
    public void receiver(String hello) {
        System.out.println("\n=============FanoutReceiver  : " + hello);
    }


}
