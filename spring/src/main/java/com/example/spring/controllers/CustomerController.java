package com.example.spring.controllers;

import com.example.spring.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

  @GetMapping("/prueba")
  public String prueba(){
    return "Hola Mundo";
  }

  @GetMapping("/prueba2")
  public List<String> prueba2(){
    List<String> list = new ArrayList<>();
    list.add("JacKy");
    list.add("Anita");
    list.add("Gebriel");
    list.add("Rafael");
    return list;
  }

  @GetMapping("/prueba3")
  public Map<String, String> prueba3(){
    Map<String, String> map = new HashMap();
    map.put("nombre","JacKy");
    map.put("telefono","57867498");
    map.put("email","jacky@example.com");
    map.put("address", "Av. Siempre Viva 123");
    return map;
  }

  @GetMapping("/prueba4")
  public List<Customer> prueba4(){
    List<Customer> customers = new ArrayList<>();
    Customer customer = new Customer();
    customer.setFirstName("PaKo");
    customer.setLastName("Araya");
    customer.setEmail("pako@example.com");
    customer.setAddress("Av. Siempre Viva 123");

    customers.add(customer);

    Customer customer2 = new Customer();
    customer2.setFirstName("Jacky");
    customer2.setLastName("Mora-Azan");
    customer2.setEmail("jacky@example.com");
    customer2.setAddress("Av. Siempre Viva 123");

    customers.add(customer2);

    return customers;
  }
}
