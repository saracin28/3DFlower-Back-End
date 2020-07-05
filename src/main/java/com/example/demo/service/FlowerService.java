package com.example.demo.service;

import com.example.demo.model.Flower;
import com.example.demo.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);

    }

    public Flower updateFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public List<Flower> getAllFlowers() {
        return (List<Flower>) flowerRepository.findAll();
    }
}
