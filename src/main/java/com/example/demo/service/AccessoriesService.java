package com.example.demo.service;

import com.example.demo.model.Accessories;
import com.example.demo.model.Flower;
import com.example.demo.repository.AccessoriesRepository;
import com.example.demo.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoriesService {
    @Autowired
    private AccessoriesRepository accessoriesRepository;

    public void addAccessories(Accessories accessories) {
        accessoriesRepository.save(accessories);

    }

    public Accessories updateAccessories(Accessories accessories) {
        return accessoriesRepository.save(accessories);
    }

    public List<Accessories> getAllAccessories() {
        return (List<Accessories>) accessoriesRepository.findAll();
    }
}
