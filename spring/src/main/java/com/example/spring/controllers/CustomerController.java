package com.example.spring.controllers;

import com.example.spring.entities.Customer;
import com.example.spring.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

  private CustomerService customerService; //Lista para cargar datos por defecto del constructor

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
    return customerService.getCustomer(id);
  }

  @GetMapping("/customer") //Traer todos los clientes
  public List<Customer> getAllCustomer() {
    return customerService.getAllCustomer();
  }

  @PostMapping("/addcustomer") //Agregar cliente
  public void addCustomer(@RequestBody Customer customer) {
    customerService.addCustomer(customer);
  }

  @DeleteMapping ("/customer/{id}") //Eliminar cliente
  public void removeCustomer(@PathVariable Integer id) {
    customerService.removeCustomer(id);
  }

  @PutMapping("/updatecustomer/{id}") //Actualizar cliente
  public void updateCustomer(@PathVariable Integer id,@RequestBody Customer updateCustomer) {
    customerService.updateCustomer(id,updateCustomer);
  }

  //Busqueda por parametros
  @GetMapping("/customer/search") //Traer un cliente en especifico
  public List<Customer> searchCustomer(@RequestParam String email){
    return customerService.searchCustomer(email);
  }

}
