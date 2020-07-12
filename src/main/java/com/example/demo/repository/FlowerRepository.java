package com.example.demo.repository;

import com.example.demo.model.Flower;
import com.example.demo.model.Pot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlowerRepository extends CrudRepository<Flower,Integer> {
    List<Flower> findAllByName(String name);

    @Query("Select flower from Flower flower where flower.id = ?1")
    Flower findById(int id);
}
