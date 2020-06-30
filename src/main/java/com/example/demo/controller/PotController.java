package com.example.demo.controller;

import com.example.demo.model.Pot;
import com.example.demo.service.PotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pot")
public class PotController {
    @Autowired
    private PotService potService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Pot> getAllPots(){
        return potService.getAllPots();
    }
}
