package com.example.spring.controllers;

import com.example.spring.models.Persona;
import com.example.spring.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

  @Autowired
  private PersonaRepository personaRepository;

  @GetMapping("/persona-mensaje")
  public String index() {
    return "CONECTADOS";
  }

  @GetMapping("/personas")
  public List<Persona> getPersonas() {
    return personaRepository.findAll();
  }

  @PostMapping("/guardar")
  public Persona savePersona(@RequestBody Persona persona) {
    return personaRepository.save(persona);
  }

  @PutMapping("/editar/{id}")
  public String updatePersona(@PathVariable Long id, @RequestBody Persona persona) {
    Persona personaActual = personaRepository.findById(id).orElse(null);
    if (personaActual != null) {
      personaActual.setNombre(persona.getNombre());
      personaActual.setTelefono(persona.getTelefono());
      personaRepository.save(personaActual);
      return "Persona actualizada";
    } else {
      return "Persona no encontrada";
    }
  }

  @DeleteMapping("/eliminar/{id}")
  public String deletePersona(@PathVariable Long id) {
    Persona persona = personaRepository.findById(id).orElse(null);
    if (persona != null) {
      personaRepository.delete(persona);
      return "Persona eliminada";
    } else {
      return "Persona no encontrada";
    }
  }

}
