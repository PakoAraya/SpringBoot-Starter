package com.example.spring.services;

import com.example.spring.entities.Customer;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CustomerService {

  private List<Customer> list = new ArrayList<>(); //Lista para cargar datos por defecto del constructor

  //Vamos a generar un constructor que se ejecute por defecto con datos de ejemplo
  public CustomerService(){
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

  public String prueba(){
    return "Hola Mundo";
  }

  public List<String> prueba2(){
    List<String> list = new ArrayList<>();
    list.add("JacKy");
    list.add("Anita");
    list.add("Gebriel");
    list.add("Rafael");
    return list;
  }

  public Map<String, String> prueba3(){
    Map<String, String> map = new HashMap();
    map.put("nombre","JacKy");
    map.put("telefono","57867498");
    map.put("email","jacky@example.com");
    map.put("address", "Av. Siempre Viva 123");
    return map;
  }

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

  public Customer getCustomer(Integer id){
    for(Customer customer : list){
      if(customer.getId() == id){
        return customer;
      }
    }
    return null;
  }

  public List<Customer> getAllCustomer() {
    return list;
  }

  public void addCustomer(Customer customer) {
    list.add(customer);
  }

  public void removeCustomer(Integer id) {
    for(Customer customer : list){
      if(customer.getId() == id){
        list.remove(customer);
        break;
      }
    }
  }

  public void updateCustomer(Integer id, Customer updateCustomer) {
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
  public List<Customer> searchCustomer(String email){
    List<Customer> searchCustomer = new ArrayList<>();
    for(Customer customer : list){
      if(customer.getEmail().contains(email)){
        searchCustomer.add(customer);
      }
    }
    return searchCustomer;
  }
}
