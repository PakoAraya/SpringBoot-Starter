package com.example.spring.repositoriestest;

import com.example.spring.models.User;
import com.example.spring.repository.UserRepositoryJPA;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

  @Autowired
  private UserRepositoryJPA userRepositoryJPA;

  @Test
  public void testAddNew(){
    User user = new User();
    user.setEmail("ayrton.senna@mclaren.com");
    user.setPassword("123456");
    user.setFirstName("Ayrton");
    user.setLastName("Senna");
    user.setEnabled(false);

    //Save the user on database
    User savedUser = userRepositoryJPA.save(user);

    //Check user has been saved correctly on database
    assertThat(savedUser).isNotNull();
    assertThat(savedUser.getId()).isGreaterThan(0);
  }

  @Test
  public void testListAll(){
    Iterable<User> users = userRepositoryJPA.findAll();
    Assertions.assertNotNull(users);
    for(User user : users){
      System.out.println(user);
    }
  }

  @Test
  public void testUpdate(){
    Integer userId = 1;
    User user = userRepositoryJPA.findById(userId).get();
    user.setPassword("654321");
    userRepositoryJPA.save(user);

    User updatedUser = userRepositoryJPA.findById(userId).get();
    assertThat(updatedUser.getPassword()).isEqualTo("654321");
  }

  @Test
  public void testGet() {
    Integer userId = 2;
    Optional<User> userOptional = userRepositoryJPA.findById(userId);
    assertThat(userOptional).isPresent();
    User user = userOptional.get();
    assertThat(user).isNotNull();
    //System.out.println(userOptional.get()); //Para mostrar los resultados de la query
  }

  @Test
  public void testDelete(){
    Integer userId = 2;
    userRepositoryJPA.deleteById(userId);
    Optional<User> userOptional = userRepositoryJPA.findById(userId);
    assertThat(userOptional).isNotPresent();
  }

}
