package com.example.demo.repository;

import com.example.demo.model.Accessories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessoriesRepository extends CrudRepository<Accessories,Integer> {
    List<Accessories> findAllByName(String name);

}
