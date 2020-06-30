package com.example.demo.controller;

import com.example.demo.model.Flower;
import com.example.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    @Autowired
    private FlowerService flowerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Flower> getAllFlowers(){
        return flowerService.getAllFlowers();
    }
}
