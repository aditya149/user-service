package com.cytrogene.user.service.controller;

import com.cytrogene.user.service.entity.User;
import com.cytrogene.user.service.service.UserService;
import com.cytrogene.user.service.userVo.UserDepartmentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    public UserService userService;

    @PostConstruct
    public void postContruct(){
      log.info("Started Controller");
    }

    @PostMapping("/")
    public User saveUser(@RequestBody User user){ //It doesn't work without request body
        return userService.saveUser(user);
    }

    @GetMapping("/{userId}")
    public UserDepartmentVo getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }
}
