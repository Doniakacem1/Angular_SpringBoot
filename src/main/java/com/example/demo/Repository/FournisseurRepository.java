package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends CrudRepository <Fournisseur, Long>{
	List<Fournisseur> findAll(Pageable sort);
}
