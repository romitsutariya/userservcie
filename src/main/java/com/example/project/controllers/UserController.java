package com.example.project.controllers;

import java.util.List;

import com.example.project.Models.User;
import com.example.project.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
    UserService userService;
    @PostMapping("user/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/user/all")
    public List<User> getAllUser(){
        return userService.getAllUsr();
    }
    @GetMapping("/user/{user_id}")
    public User getUserById(@PathVariable("user_id")Integer user_id){
        return userService.findUserById(user_id);
    }
    @DeleteMapping("/user/{user_id}")
    public void deletetUserById(@PathVariable("user_id")Integer user_id){
        userService.deleteById(user_id);
    }
}
