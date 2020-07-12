package com.example.demo.repository;

import com.example.demo.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    List<Cart> findAllByName(String name);
}
