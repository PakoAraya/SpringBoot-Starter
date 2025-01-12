package com.example.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring.models.Product;

public interface ProductsRepositoryJPA extends JpaRepository<Product, Long> {

}
