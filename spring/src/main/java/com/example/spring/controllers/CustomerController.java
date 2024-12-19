package com.example.spring.controllers;

import com.example.spring.entities.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

  private List<Customer> list = new ArrayList<>(); //Lista para cargar datos por defecto del constructor

  //Vamos a generar un constructor que se ejecute por defecto con datos de ejemplo
  public CustomerController(){
    Customer customer = new Customer();
    customer.setId(1);
    customer.setFirstName("Jacky");
    customer.setLastName("Mora-Azan");
    customer.setEmail("jacky@example.com");
    customer.setAddress("Av. Siempre Viva 123");

    list.add(customer); //Se envia a la variable declarada arriba

    Customer customer2 = new Customer();
    customer2.setId(2);
    customer2.setFirstName("PaKo");
    customer2.setLastName("Araya");
    customer2.setEmail("pako@example.com");
    customer2.setAddress("Av. Siempre Viva 123");

    list.add(customer2); //Se envia a la variable declarada arriba
  }

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
    customer.setId(107);
    customer.setFirstName("PaKo");
    customer.setLastName("Araya");
    customer.setEmail("pako@example.com");
    customer.setAddress("Av. Siempre Viva 123");

    customers.add(customer);

    Customer customer2 = new Customer();
    customer2.setId(108);
    customer2.setFirstName("Jacky");
    customer2.setLastName("Mora-Azan");
    customer2.setEmail("jacky@example.com");
    customer2.setAddress("Av. Siempre Viva 123");

    customers.add(customer2);

    return customers;
  }

  //Vamos a ver los metodos de una API REST

  @GetMapping("/customer/{id}") //Traer un cliente en especifico
  public Customer getCustomer(@PathVariable Integer id){
    for(Customer customer : list){
      if(customer.getId() == id){
        return customer;
      }
    }
    return null;
  }

  @GetMapping("/customer") //Traer todos los clientes
  public List<Customer> getAllCustomer() {
    return list;
  }

  @GetMapping("/addcustomer") //Agregar cliente
  public void addCustomer(Customer customer) {

  }

  @GetMapping("/deletecustomer") //Eliminar cliente
  public void removeCustomer() {

  }

  @GetMapping("/updatecustomer") //Actualizar cliente
  public void updateCustomer() {

  }

  @GetMapping("/searchcustomer") //Buscar cliente
  public List<Customer> searchCustomer() {
    return null;
  }


}
