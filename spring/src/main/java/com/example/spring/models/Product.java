package com.example.spring.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "products")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "brand", nullable = false)
  private String brand;
  @Column(name = "category", nullable = false)
  private String category;
  @Column(name = "price", nullable = false)
  private double price;
  @Column(name = "description", columnDefinition = "TEXT")
  private String description;
  @Column(name = "created_at", nullable = false)
  private Date created_at;
  @Column(name = "image_file_name")
  private String imageFileName;

  //Empty constructor of the class
  public Product() {
  }

  //Constructor of the class
  public Product(long id, String name, String brand, String category, double price, String description, Date created_at, String imageFileName) {
    this.id = id;
    this.name = name;
    this.brand = brand;
    this.category = category;
    this.price = price;
    this.description = description;
    this.created_at = created_at;
    this.imageFileName = imageFileName;
  }

  //Getters and Setters
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date created_at) {
    this.created_at = created_at;
  }

  public String getImageFileName() {
    return imageFileName;
  }

  public void setImageFileName(String imageFileName) {
    this.imageFileName = imageFileName;
  }
}
