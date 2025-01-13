package com.example.spring.dtos;

import com.example.spring.models.Product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;

public class ProductsDTO {
  private long id;
  @NotEmpty(message = "The name is required")
  private String name;
  @NotEmpty(message = "The brand is required")
  private String brand;
  @NotEmpty(message = "The category is required")
  private String category;
  @Min(0)
  private double price;
  @Size(min = 10, message = "The description must have at least 10 characters")
  @Size(max = 2000, message = "The description must have less than 2000 characters")
  private String description;

  private Date created_at;
  private String imagePath;

  public ProductsDTO() {
  }

  public ProductsDTO(long id, String name, String brand, String category, double price, String description, Date created_at, String imagePath) {
    this.id = id;
    this.name = name;
    this.brand = brand;
    this.category = category;
    this.price = price;
    this.description = description;
    this.created_at = created_at;
    this.imagePath = imagePath;
  }

  public ProductsDTO(Product product){
    this.id = product.getId();
    this.name = product.getName();
    this.brand = product.getBrand();
    this.category = product.getCategory();
    this.price = product.getPrice();
    this.description = product.getDescription();
    this.created_at = product.getCreated_at();
    this.imagePath = product.getImagePath();
  }

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

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
}
