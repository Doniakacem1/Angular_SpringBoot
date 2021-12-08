package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.StockServiceImpl;
import com.example.demo.entities.Stock;
@RestController
public class StockRestController {
	@Autowired
	StockServiceImpl StockService ;
	
	@GetMapping("/getAllStock")
	public List<Stock> getStock(){
	List<Stock> listStock = StockService.retrieveAllStock();
	return listStock;
	}
	@GetMapping("/getStock/{idStock}")

	public Stock retrieveStock(@PathVariable("idStock") Long idStock) {
	return StockService.retrieveStock(idStock);
	}
	@PostMapping("/add-stock")

	public Long addStock(@RequestBody Stock c)
	{
	Long stock = StockService.addStock(c);
	return stock;
	}
	@DeleteMapping("/remove-stock/{idStock}")
	@ResponseBody
	public void removeStock(@PathVariable("idStock") Long idStock) {
	StockService.deleteStock(idStock);
	}

	@PutMapping("/modify-stock")
	@ResponseBody
	public Stock modifyStock(@RequestBody Stock stock) {
	return StockService.updateStock(stock);
	}

}
