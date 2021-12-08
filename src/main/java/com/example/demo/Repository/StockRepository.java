package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Stock;

@Repository
public interface StockRepository extends CrudRepository <Stock, Long> {
List<Stock> findAll(Pageable sort);
	
	//retrieveStatus
	@Query("SELECT s from Stock s where s.qteStock< s.qteMin")
	List<Stock> retrieveStatusStock();
}
