package com.example.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {

  @GetMapping("/hola")
  public String miPrimeraRuta(){
    return "Hola Mundo desde mi primer Spring Controller";
  }
}
