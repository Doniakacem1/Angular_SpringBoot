package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StockRepository;

import com.example.demo.entities.Stock;

@Service
public class StockServiceImpl implements IStockService{
	@Autowired
	StockRepository StockRepository;

	@Override
	public List<Stock> retrieveAllStock() {
		List<Stock> Stock=(List<Stock>) StockRepository.findAll();
		for(Stock p : Stock){
			System.out.println(p);
		}
		return Stock;
	}

	@Override
	public Long addStock(Stock u) {
		StockRepository.save(u); 
		return u.getIdStock();
	}

	@Override
	public void deleteStock(Long id) {
		StockRepository.deleteById(id);
		
	}

	@Override
	public Stock updateStock(Stock u) {
		StockRepository.save(u); 
		return u;
	}

	@Override
	public Stock retrieveStock(Long id) {
		return StockRepository.findById(id).get(); 
	}

}
