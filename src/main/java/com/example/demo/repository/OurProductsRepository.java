package com.example.demo.repository;

import com.example.demo.model.OurProducts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OurProductsRepository extends CrudRepository<OurProducts, Integer> {
    List<OurProducts> findAllByName(String name);

    @Query("Select ourproducts from OurProducts ourproducts where ourproducts.id=?1")
    OurProducts findById(int id);
}
