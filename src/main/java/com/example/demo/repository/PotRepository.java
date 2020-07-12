package com.example.demo.repository;

import com.example.demo.model.Pot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PotRepository extends CrudRepository<Pot,Integer> {
    List<Pot> findAllByName(String name);

    @Query("Select pot from Pot pot where pot.id = ?1")
    Pot findById(int id);
}
