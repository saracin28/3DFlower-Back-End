package com.example.demo.service;

import com.example.demo.model.Accessories;
import com.example.demo.repository.AccesorriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoriesService {
    @Autowired
    private AccesorriesRepository accesorriesRepository;

    public List<Accessories> getAllAccessories(){
        return (List<Accessories>) accesorriesRepository.findAll();
    }

}
