package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Produit;


@Repository
public interface ProduitRepository extends CrudRepository <Produit, Long>{

}
