package com.example.demo.controller;

import com.example.demo.model.Flower;
import com.example.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<Flower> getAllFlowers() {
        return flowerService.getAllFlowers();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addFlower(@RequestBody Flower flower) {
        flowerService.addFlower(flower);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Flower updateFlower(@RequestBody Flower flower) {
        return flowerService.updateFlower(flower);
    }
}
