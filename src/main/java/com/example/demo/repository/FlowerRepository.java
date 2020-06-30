package com.example.demo.repository;

import com.example.demo.model.Flower;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowerRepository extends CrudRepository<Flower,Integer> {
    List<Flower> findAllByName(String name);

}
