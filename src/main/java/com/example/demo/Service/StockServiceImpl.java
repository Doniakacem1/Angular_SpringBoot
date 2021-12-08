package com.example.demo.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StockRepository;

import com.example.demo.entities.Stock;

import lombok.extern.slf4j.Slf4j;
@Aspect
@Slf4j
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
	
	@Override
	public	 List<Stock> getStock() {
		Sort sort = Sort.by("idStock").descending();
		Pageable pageable = PageRequest.of(0, 2, sort);
		List<Stock> stocks =(List<Stock>)StockRepository.findAll(pageable);
		return stocks;
	}
	@Scheduled(cron = "*/60 * * * * *" )
	public String retrieveStatusStock() {
			SimpleDateFormat sdf = new 	SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			Date now = new Date();
			String msgDate = sdf.format(now);
			String finalMessage = "";
			String newLine = System.getProperty("line.separator");
			List<Stock> stocks = StockRepository.retrieveStatusStock();
			for (int i= 0; i < stocks.size(); i++) {
				finalMessage = newLine + finalMessage +  msgDate + newLine + ": le produit"
						+stocks.get(i).getLibelleStock() +  "a un stock de" + stocks.get(i).getQteStock()
						+ "inférieur à la quantité minimale a ne pas dépasser de " + stocks.get(i).getQteMin()
						+newLine;
				
			}
			log.info(finalMessage);
			return finalMessage;
	
}
	
}
