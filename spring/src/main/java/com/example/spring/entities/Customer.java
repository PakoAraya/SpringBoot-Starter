package com.example.spring.entities;

// @Getter @Setter @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode @ToString (Todo eso se sustituye con Data)
public class Customer {
  private Integer id;
  private String firstName;
  private String lastName;
  private String email;
  private String address;

  public Customer() {
  }

  public Integer getId() {
    return this.id;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getEmail() {
    return this.email;
  }

  public String getAddress() {
    return this.address;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Customer)) return false;
    final Customer other = (Customer) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$firstName = this.getFirstName();
    final Object other$firstName = other.getFirstName();
    if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
    final Object this$lastName = this.getLastName();
    final Object other$lastName = other.getLastName();
    if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
    final Object this$email = this.getEmail();
    final Object other$email = other.getEmail();
    if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
    final Object this$address = this.getAddress();
    final Object other$address = other.getAddress();
    if (this$address == null ? other$address != null : !this$address.equals(other$address)) return false;
    return true;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof Customer;
  }

  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $firstName = this.getFirstName();
    result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
    final Object $lastName = this.getLastName();
    result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
    final Object $email = this.getEmail();
    result = result * PRIME + ($email == null ? 43 : $email.hashCode());
    final Object $address = this.getAddress();
    result = result * PRIME + ($address == null ? 43 : $address.hashCode());
    return result;
  }

  public String toString() {
    return "Customer(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", email=" + this.getEmail() + ", address=" + this.getAddress() + ")";
  }
}
