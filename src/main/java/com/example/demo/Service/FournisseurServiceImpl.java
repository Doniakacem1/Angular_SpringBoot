package com.example.demo.Service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.FournisseurRepository;
import com.example.demo.entities.Facture;
import com.example.demo.entities.Fournisseur;

@Service
public class FournisseurServiceImpl implements IFournisseurService {

	@Autowired
	FournisseurRepository FournisseurRepository;
	@Override
	public List<Fournisseur> retrieveAllFournisseur() {
		List<Fournisseur> Fournisseur=(List<Fournisseur>) FournisseurRepository.findAll();
		for(Fournisseur p : Fournisseur){
			System.out.println(p);
		}
		return Fournisseur;
	}

	@Override
	public Fournisseur addFournisseur(Fournisseur u) {
		FournisseurRepository.save(u); 
		return u;
	}

	@Override
	public void deleteFournisseur(Long id) {
		FournisseurRepository.deleteById(id);
		
	}

	@Override
	public Fournisseur updateFournisseur(Fournisseur u) {
		FournisseurRepository.save(u); 
		return u;
	}

	@Override
	public Fournisseur retrieveFournisseur(Long id) {
		return FournisseurRepository.findById(id).get(); 
	}

	@Override
	public List<Fournisseur> getFournisseurs() {
		Sort sort = Sort.by("idFournisseur").descending();
		Pageable pageable = PageRequest.of(0, 2, sort);
		List<Fournisseur> rayons =(List<Fournisseur>)FournisseurRepository.findAll(pageable);
		return rayons;
	}
	@Override
    public List<Fournisseur> findAll() {

        return (List<Fournisseur>) FournisseurRepository.findAll();
    }

}
