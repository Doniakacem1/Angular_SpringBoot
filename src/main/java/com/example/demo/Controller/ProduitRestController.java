package com.example.demo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.IProduitService;
import com.example.demo.entities.Produit;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProduitRestController {
	@Autowired
	IProduitService produitService;
	// http://localhost:8081/SpringMVC/servlet/getAllProduit
	@GetMapping("getAllProduit")
	public List<Produit> getDetailProduit() {
	return produitService.retrieveAllProducts();

	}

	// http://localhost:8081/SpringMVC/servlet/retrieveProduit/1
	@GetMapping("/retrieveProduit/{id_Produit}")
	public Produit retrieveDetailProduit(@PathVariable("id_Produit") long ProduitId) {
	return produitService.retrieveProducts(ProduitId);
	}
	//http://localhost:8081/SpringMVC/servlet/add-produit
	 @PostMapping("/add-produit")

	 public Produit addProduit(@RequestBody Produit dp)
	 {
	 return produitService.addProduit(dp,dp.getRayon().getIdRayon(),dp.getStock().getIdStock());

	 }
	//http://localhost:8081/SpringMVC/servlet/update-produit
	 @PutMapping("/update-produit")
	 @ResponseBody
	 public Produit updateProduit(@RequestBody Produit p)
	 {
	 return produitService.updateProducts(p);
	 }
	 //http://localhost:8081/SpringMVC/servlet/delete-produit/1
	 @DeleteMapping("/delete-produit/{id}")
	 public void deleteProduit(@PathVariable Long id)
	 {
	 produitService.deleteProducts(id);
	 }
}
