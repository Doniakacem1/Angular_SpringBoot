package com.example.demo.Service;

import java.util.List;
import com.example.demo.entities.Produit;


public interface IProduitService {
	List<Produit> retrieveAllProducts();
	Produit addProduit(Produit p, Long idRayon, Long idStock);
	void deleteProducts(Long id);
	Produit updateProducts(Produit u);
	Produit retrieveProducts(Long id);
	

}
