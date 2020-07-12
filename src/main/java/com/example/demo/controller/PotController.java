package com.example.demo.controller;

import com.example.demo.model.Pot;
import com.example.demo.service.PotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pot")
public class PotController {
    @Autowired
    private PotService potService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Pot> getAllPots() {
        return potService.getAllPots();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addPot(@RequestBody Pot pot) {
        potService.addPot(pot);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Pot updatePot(@RequestBody Pot pot) {
        return potService.updatePot(pot);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Pot getPotById(@PathVariable("id") int id) {
        return potService.getPotById(id);
    }
}
