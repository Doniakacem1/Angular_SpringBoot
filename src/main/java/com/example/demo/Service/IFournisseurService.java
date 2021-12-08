package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Fournisseur;;

public interface IFournisseurService {

	List<Fournisseur> retrieveAllFournisseur();
	Fournisseur addFournisseur(Fournisseur u);
	void deleteFournisseur(Long id);
	Fournisseur updateFournisseur(Fournisseur u);
	Fournisseur retrieveFournisseur(Long id);
	 List<Fournisseur> getFournisseurs();
	 List<Fournisseur> findAll();
}
