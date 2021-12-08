package com.example.demo.Service;

import java.util.Date;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Repository.DetailProduitRepository;
import com.example.demo.Repository.ProduitRepository;
import com.example.demo.Repository.RayonRepository;
import com.example.demo.Repository.StockRepository;
import com.example.demo.entities.DetailProduit;
import com.example.demo.entities.Produit;

@Service
public class ProduitServiceImpl implements IProduitService {

	@Autowired
	ProduitRepository ProduitRepository;
@Autowired
	RayonRepository RayonRepository;
@Autowired 
	StockRepository StockRepository;
@Autowired 
DetailProduitRepository DetailProduitRepository;
@Override
public List<Produit> retrieveAllProducts() {
	List<Produit> produits =(List<Produit> )ProduitRepository.findAll();

	for (Produit p: produits){
		
		System.out.println("test");
	}
	return produits;
}
@Override
@Transactional
public Produit addProduit(Produit p, Long idRayon, Long idStock) {
	p.setStock(StockRepository.findById(idStock).get());
	p.setRayon(RayonRepository.findById(idRayon).get());
	ProduitRepository.save(p);
	return(p);
}
@Override
public void deleteProducts(Long id) {
	ProduitRepository.deleteById(id);
}
@Override
public Produit updateProducts(Produit u) {
	ProduitRepository.save(u);
	return u;
}
@Override
public Produit retrieveProducts(Long id) {
	return ProduitRepository.findById(id).get(); 
}
@Transactional
private DetailProduit saveDetailProduit(Produit p){
if(p.getDetail().getDateCreation()==null){
p.getDetail().setDateCreation(new Date());
p.getDetail().setDateDerniereModification(new Date());
}else{
p.getDetail().setDateDerniereModification(new Date());
}
DetailProduit dp = DetailProduitRepository.save(p.getDetail());
return dp;
}




}
