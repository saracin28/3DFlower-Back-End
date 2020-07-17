package com.example.demo.repository;

import com.example.demo.model.Pot;
import com.example.demo.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findAllByUsername(String username);

    @Query("Select user from User user where user.username = ?1")
    User findByName(String name);

    @Query("Select user from User user where user.id = ?1")
    User findById(int id);
}
