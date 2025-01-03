package com.example.spring.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Rutas {

  private final Logger logger = LoggerFactory.getLogger(Rutas.class);

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

  //Vamos a aprender a usar post mapping
  @PostMapping("/libro")
  public String guardarLibro(@RequestBody Map<String, Object> libro){
    libro.keySet().forEach(llave -> {
      logger.debug("Llave: {" + llave + "} Valor: {" + libro.get(llave) + "}");
    });

    return "Libro Guardado";
  }
}
