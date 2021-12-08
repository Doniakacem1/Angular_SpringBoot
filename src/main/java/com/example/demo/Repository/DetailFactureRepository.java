package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entities.DetailFacture;

@Repository
public interface DetailFactureRepository extends CrudRepository <DetailFacture, Long>{

}
