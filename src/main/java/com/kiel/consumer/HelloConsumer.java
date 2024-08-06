package com.kiel.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {

    @RabbitListener(queues = "course.hello")
    public void listen(String name) {
        System.out.println("Consuming : " + name);
    }
}
