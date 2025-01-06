package com.example.spring.services;

import com.example.spring.models.User;
import com.example.spring.repository.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  @Autowired
  private UserRepositoryJPA userRepositoryJPA;


  public List<User> listAll(){
    return (List<User>) userRepositoryJPA.findAll();
  }

  public String save(User user) {
    userRepositoryJPA.save(user);
    return "redirect:/users";
  }
}
