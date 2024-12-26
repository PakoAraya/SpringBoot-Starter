package com.example.spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Rutas {

  @GetMapping("/hola")
  public String miPrimeraRuta(){
    return "Hola Mundo desde mi primer Spring Controller";
  }
  //Ejemplo de Path Params
  @GetMapping("/libro/{id}/editorial/{editorial}")
  public String leerLibro(@PathVariable int id, @PathVariable String editorial){
    return "Leyendo el libro id: " + id+ " de la editorial: " + editorial;
  }

  //Ejemplo de Query Params
  @GetMapping("/libro2/{id}")
  public String leerLibro2(@PathVariable int id, @RequestParam String editorial, @RequestParam String params){
    return "Leyendo el libro id: " + id+ " editorial " + editorial + " params: " + params;
  }
}
