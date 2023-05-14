package com.kafka.service.impl;

import com.kafka.domain.User;
import com.kafka.service.UserService;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private KafkaTemplate<String, User> kafkaTemplate;

    public UserServiceImpl(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void store(User userList) {
      kafkaTemplate.send("userRegister", userList);
    }
}
