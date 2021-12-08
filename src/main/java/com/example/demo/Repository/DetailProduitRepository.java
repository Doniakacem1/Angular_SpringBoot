package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.DetailProduit;

@Repository
public interface DetailProduitRepository extends CrudRepository <DetailProduit, Long>{

}
