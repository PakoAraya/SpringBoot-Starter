package com.example.spring.interfaces;

import com.example.spring.entities.Customer;

import java.util.List;

public interface CustomerService {
  Customer getCustomer(Integer id);
  List<Customer> getAllCustomer();
  void addCustomer(Customer customer);
  void removeCustomer(Integer id);
  void updateCustomer(Integer id, Customer updateCustomer);
  List<Customer> searchCustomer(String email);

  //Desde Java8 se puede agregar cuerpo de funcion en interfaces
  default void hacerAlgo(){
    System.out.println("hacerAlgo");
  }
}
