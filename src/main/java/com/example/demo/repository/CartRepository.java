package com.example.demo.repository;

import com.example.demo.model.Cart;
import com.example.demo.model.Flower;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer> {
    List<Cart> findAllByName(String name);

    @Query("Select cart from Cart cart where cart.user_id=?1")
    List<Cart> findCartsById(int id);
}
