package com.rabbit.demo;

import com.rabbit.demo.bean.User;
import com.rabbit.demo.message.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRabbitMqTests {

    @Autowired
    private HelloSender helloSender;

    @Test
    public void hello() throws Exception {
        helloSender.send();
    }
    //一对多发送
    @Test
    public void oneToMany() throws Exception {
        for (int i=0;i<100;i++){
            helloSender.send(i);
        }
    }

    @Test
    public void sendObject() throws Exception {
        User admin = User.builder().age(24).username("admin").password("123456").build();
        helloSender.send(admin);
    }
    @Test
    public void send1()  {
        helloSender.send1();
        helloSender.send2();
    }
    @Test
    public void sendFanoutExchange()  {
        helloSender.sendFanoutExchange();
    }

}
