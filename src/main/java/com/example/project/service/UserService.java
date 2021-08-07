package com.example.project.service;

import java.util.List;

import com.example.project.Models.User;
import com.example.project.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
    
	public User createUser(User usre){
        return userRepository.save(usre);
	}
	public List<User>  getAllUsr(){
        return userRepository.findAll();
	}
	public User  findUserById(Integer user_id){
        return userRepository.findById(user_id).orElse(new User());
	}
	public void  deleteById(Integer user_id){
         userRepository.deleteById(user_id);
	}
}

