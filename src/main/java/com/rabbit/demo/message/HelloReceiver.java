package com.rabbit.demo.message;

import com.rabbit.demo.bean.User;
import com.rabbit.demo.config.TopicRabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"hello","user", TopicRabbitConfig.message,TopicRabbitConfig.messages})
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("=============Receiver  : " + hello);
    }

    //接收者
    @RabbitHandler
    public void process(User user) {
        System.out.println("=============Receiver object : " + user);
    }

}
