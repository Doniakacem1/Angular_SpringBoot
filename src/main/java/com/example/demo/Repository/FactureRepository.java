package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Facture;

@Repository
public interface FactureRepository extends CrudRepository <Facture, Long>{

}
