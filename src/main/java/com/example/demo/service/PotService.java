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

    public List<Pot> getAllPots() {
        return (List<Pot>) potRepository.findAll();
    }

    public void addPot(Pot pot) {
        potRepository.save(pot);
    }

    public Pot updatePot(Pot pot) {
        pot.setName(pot.getName());
        pot.setPrice(pot.getPrice());
        pot.setDescription(pot.getDescription());
        potRepository.save(pot);
        return pot;
    }

    public Pot getPotById(int pot) {return potRepository.findById(pot);
    }
}
