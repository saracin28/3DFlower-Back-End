package com.example.demo.controller;

import com.example.demo.model.OurProducts;
import com.example.demo.service.OurProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ourProducts")
public class OurProductsController {
    @Autowired
    private OurProductsService ourProductsService;

    @RequestMapping(method= RequestMethod.GET)
    public List<OurProducts> getAllOurProducts() {
        return ourProductsService.getAllOurProducts();
    }

    @RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addOurProducts(@RequestBody OurProducts ourProducts) {
        ourProductsService.addOurProducts(ourProducts);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateOurProducts(@RequestBody OurProducts ourProducts) {
        ourProductsService.updateOurProducts(ourProducts);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OurProducts getOurProductsById(@PathVariable("id") int id) {
        return ourProductsService.getOurProductsById(id);
    }


}
