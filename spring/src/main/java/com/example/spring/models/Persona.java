package com.example.spring.models;

import jakarta.persistence.*;

@Entity
public class Persona {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "nombre")
  private String nombre;

  @Column(name = "telefono")
  private String telefono;

  public Persona() {
  }

  public Persona(long id, String nombre, String telefono) {
    this.id = id;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
}
