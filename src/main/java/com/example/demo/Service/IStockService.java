package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Stock;

public interface IStockService {
	List<Stock> retrieveAllStock();
	Long addStock(Stock u);
	void deleteStock(Long id);
	Stock updateStock(Stock u);
	Stock retrieveStock(Long id);

}
