package com.kafka.service;

import com.kafka.domain.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class KafkaListner {

    @KafkaListener(topics = "userRegister", groupId = "groupId")
    void Listener(List<User> data) {
        System.out.println("Listener data: "+ data);
    }
}
