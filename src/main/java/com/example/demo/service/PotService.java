package com.example.demo.service;

import com.example.demo.model.Pot;
import com.example.demo.repository.PotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotService {
    @Autowired
    private PotRepository potRepository;

    public List<Pot> getAllPots(){
       return (List<Pot>) potRepository.findAll();
    }
}
