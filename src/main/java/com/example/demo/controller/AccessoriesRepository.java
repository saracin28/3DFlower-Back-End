package com.example.demo.controller;

import com.example.demo.model.Accessories;
import com.example.demo.service.AccessoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accessories")
public class AccessoriesRepository {
    @Autowired
    private AccessoriesService accessoriesService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Accessories> getAllAccessories(){
        return accessoriesService.getAllAccessories();
    }
}
