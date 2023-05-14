package com.kafka.resource;

import com.kafka.domain.User;
import com.kafka.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserResource {
    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<String> store(@RequestBody User user){
      userService.store(user);
      return ResponseEntity.ok("User data is stored in UserRegister topic.");
    }
}
