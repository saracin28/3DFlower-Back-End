package com.example.demo.service;

import com.example.demo.model.OurProducts;
import com.example.demo.repository.OurProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OurProductsService {
    @Autowired
    private OurProductsRepository ourProductsRepository;

    public void addOurProducts(OurProducts ourProducts) {
        ourProductsRepository.save(ourProducts);
    }

    public OurProducts updateOurProducts(OurProducts ourProducts) {
        ourProducts.setName(ourProducts.getName());
        ourProducts.setImage(ourProducts.getImage());
        ourProducts.setPrice(ourProducts.getPrice());
        ourProducts.setDescription(ourProducts.getDescription());
        ourProductsRepository.save(ourProducts);
        return ourProducts;
    }

    public List<OurProducts> getAllOurProducts() {
        return (List<OurProducts>) ourProductsRepository.findAll();
    }

    public OurProducts getOurProductsById(int ourProducts) {
        return ourProductsRepository.findById(ourProducts);
    }


}
