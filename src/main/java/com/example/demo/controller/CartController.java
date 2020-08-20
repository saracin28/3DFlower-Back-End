package com.example.demo.controller;

import com.example.demo.model.Cart;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Cart> getAllCarts() {
        return cartService.getAllCarts();
    }

    @RequestMapping(params = {"user_id"}, method = RequestMethod.GET)
    public List<Cart> getCartsById(@RequestParam int user_id) {
        return cartService.getCartsById(user_id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cart addCart(@RequestBody Cart cart) {
        return cartService.addCart(cart);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cart updateCart(@RequestBody Cart cart) {
        return cartService.updateCart(cart);
    }

    @RequestMapping(method = RequestMethod.DELETE, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public void deleteCart(@RequestParam int id){
        cartService.deleteCart(id);
    }

}
