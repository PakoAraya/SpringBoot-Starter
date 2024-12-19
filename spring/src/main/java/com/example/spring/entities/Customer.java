package com.example.spring.entities;

import java.util.Objects;

public class Customer {
  private String firstName;
  private String lastName;
  private String email;
  private String address;

  public Customer(){

  }

  public Customer(String firstName, String lastName, String email, String address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.address = address;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Customer customer = (Customer) o;
    return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(address, customer.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, email, address);
  }

  @Override
  public String toString() {
    return "Customer{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}
