package com.example.demo;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Service.IFournisseurService;
import com.example.demo.entities.Fournisseur;
@RunWith(SpringRunner.class)
@SpringBootTest
public class FournisseurServiceImplTest {
	@Autowired
	IFournisseurService fournisseurService;
	@Test
	public void testAddStock() {
	List<Fournisseur> stocks = fournisseurService.retrieveAllFournisseur();
	int expected=stocks.size();
	Fournisseur s = new Fournisseur();

	

	s.setLibelleFornisseur("fournisseur test");
	s.setCodeFornisseur("fournisseur test");
	
	Fournisseur savedStock= fournisseurService.addFournisseur(s);
	assertEquals(expected+1, fournisseurService.retrieveAllFournisseur().size());
	assertNotNull(savedStock.getLibelleFornisseur());
	fournisseurService.deleteFournisseur(savedStock.getIdFournisseur());

	}}
