package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.DAO.entity.Facture;
import tn.esprit.spring.service.IFactureService;




public class factureServiceImplTest {
	@Autowired
	IFactureService factureService;
	@Test
	public void testAddFcature() {
	List<Facture> factures = factureService.retrieveAllFacture();
	int expected=factures.size();
	Facture f = new Facture();


	String i ="12.2";
	String date ="2021-12-21";
	f.setMontantFacture(Float.parseFloat(i));
	f.setMontantRemise(Float.parseFloat(i));
  
	f.setActive(true);
	Facture savedFact= factureService.addFacture(f);
	assertEquals(expected+1, factureService.retrieveAllFacture().size());
	assertNotNull(savedFact.getMontantFacture());
	factureService.deleteFacture(savedFact.getIdFacture());
}}
