package com.example.demo.service;

import com.example.demo.dto.RegisterDto;
import com.example.demo.model.Cart;
import com.example.demo.model.User;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> getAllCarts() {
        return (List<Cart>) cartRepository.findAll();
    }

    public List<Cart> getCartsById(int user_id){
        return (List<Cart>) cartRepository.findCartsById(user_id);
    }

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Cart updateCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public void deleteCart(int id) {
            cartRepository.deleteById(id);
    }
}
