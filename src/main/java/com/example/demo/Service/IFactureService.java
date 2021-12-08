package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Facture;

public interface IFactureService {

	List<Facture> retrieveAllFacture();
	Long addFacture(Facture u);
	void deleteFacture(Long id);
	Facture updateFacture(Facture u);
	Facture retrieveFacture(Long id);
}
