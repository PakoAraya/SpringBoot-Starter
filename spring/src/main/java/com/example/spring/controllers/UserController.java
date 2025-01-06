package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/")
  public String showHomePage() {
    System.out.println("Hello World in User Controller");
    return "index";
  }
}
