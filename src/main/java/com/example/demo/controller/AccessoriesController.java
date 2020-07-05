package com.example.demo.controller;

import com.example.demo.model.Accessories;
import com.example.demo.model.Flower;
import com.example.demo.service.AccessoriesService;
import com.example.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accessories")
public class AccessoriesController {
    @Autowired
    private AccessoriesService accessoriesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Accessories> getAllFlowers() {
        return accessoriesService.getAllAccessories();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addAccessories(@RequestBody Accessories accessories) {
        accessoriesService.addAccessories(accessories);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Accessories updateAccessories(@RequestBody Accessories accessories) {
        return accessoriesService.updateAccessories(accessories);
    }
}
