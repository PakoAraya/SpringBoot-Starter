package com.example.spring.controllers;

import com.example.spring.entities.Customer;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/addcustomer") //Agregar cliente
  public void addCustomer(@RequestBody Customer customer) {
    list.add(customer);
  }

  @DeleteMapping ("/customer/{id}") //Eliminar cliente
  public void removeCustomer(@PathVariable Integer id) {
    for(Customer customer : list){
      if(customer.getId() == id){
        list.remove(customer);
        break;
      }
    }
  }

  @PutMapping("/updatecustomer/{id}") //Actualizar cliente
  public void updateCustomer(@PathVariable Integer id,@RequestBody Customer updateCustomer) {
    for(Customer customer : list){
      if(customer.getId() == id){
        list.remove(customer);
        updateCustomer.setId(id);
        list.add(updateCustomer);
        break;
      }
    }
  }

  //Busqueda por parametros
  @GetMapping("/customer/search") //Traer un cliente en especifico
  public List<Customer> getCustomer(@RequestParam String email){
    List<Customer> searchCustomer = new ArrayList<>();
    for(Customer customer : list){
      if(customer.getEmail().contains(email)){
        searchCustomer.add(customer);
      }
    }
    return searchCustomer;
  }

}
