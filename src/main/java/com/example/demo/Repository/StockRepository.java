package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Stock;

@Repository
public interface StockRepository extends CrudRepository <Stock, Long> {

}
