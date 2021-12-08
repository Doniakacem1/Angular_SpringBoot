package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Rayon;

@Repository
public interface RayonRepository extends CrudRepository <Rayon, Long> {
	List<Rayon> findAll(Pageable sort);
}
