package com.example.spring.repositories;

import com.example.spring.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryJPA extends CrudRepository<User, Integer> {

}
