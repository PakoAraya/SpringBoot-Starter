package com.example.spring.controllers;

import com.example.spring.dtos.ProductsDTO;
import com.example.spring.models.Product;
import com.example.spring.repositories.ProductsRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/store")
public class ProductsController {

  @Autowired
  private ProductsRepositoryJPA productsRepositoryJPA;

  @GetMapping("/products")
  public String showProductsList(Model model){
    List<Product> productsList = productsRepositoryJPA.findAll(Sort.by(Sort.Direction.ASC, "id"));
    model.addAttribute("productsList", productsList);
    return "products";
  }

  @GetMapping("/create")
  public String showCreateForm(Model model){
    ProductsDTO productsDTO = new ProductsDTO();
    model.addAttribute("productsDTO", productsDTO);
    return "create-product";
  }

  @PostMapping("/create")
  public String createProduct(ProductsDTO productsDTO){
    Product product = new Product();
    product.setName(productsDTO.getName());
    product.setBrand(productsDTO.getBrand());
    product.setCategory(productsDTO.getCategory());
    product.setDescription(productsDTO.getDescription());
    product.setPrice(productsDTO.getPrice());
    product.setImagePath(productsDTO.getImagePath());
    productsRepositoryJPA.save(product);
    return "redirect:/store/products";
  }
}