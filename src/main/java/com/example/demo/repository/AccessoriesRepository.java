package com.example.demo.repository;

import com.example.demo.model.Accessories;
import com.example.demo.model.Pot;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessoriesRepository extends CrudRepository<Accessories,Integer> {
    List<Accessories> findAllByName(String name);

    @Query("Select Accessories from Accessories accessories where accessories.id = ?1")
    Accessories findById(int id);
}
