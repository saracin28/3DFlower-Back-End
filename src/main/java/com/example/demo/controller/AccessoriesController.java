package com.example.demo.controller;

import com.example.demo.model.Accessories;
import com.example.demo.model.Pot;
import com.example.demo.service.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accessories")
public class AccessoriesController {
    @Autowired
    private AccessoriesService accessoriesService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Accessories> getAllAccessories() {
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Accessories getPotById(@PathVariable("id") int id) {
        return accessoriesService.getAccessoriesById(id);
    }
}
