package com.example.spring.services;

import com.example.spring.models.User;
import com.example.spring.repositories.UserRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

  public User get(Integer id) {
    Optional<User> result = userRepositoryJPA.findById(id);
    if(result.isPresent()) {
      return result.get();
    } else {
      throw new RuntimeException("Could not found any user with id: " + id);
    }
  }
}
