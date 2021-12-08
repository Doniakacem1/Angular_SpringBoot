package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.FactureRepository;

import com.example.demo.entities.Facture;

@Service
public class FactureServiceImpl implements IFactureService{

	@Autowired
	FactureRepository FactureRepository;
	@Override
	public List<Facture> retrieveAllFacture() {
		List<Facture> Facture=(List<Facture>) FactureRepository.findAll();
		for(Facture p : Facture){
			System.out.println(p);
		}
		return Facture;
	}

	@Override
	public Long addFacture(Facture u) {
		FactureRepository.save(u); 
		return u.getIdFacture();
	}

	@Override
	public void deleteFacture(Long id) {
		FactureRepository.deleteById(id);
		
	}

	@Override
	public Facture updateFacture(Facture u) {
		FactureRepository.save(u); 
		return u;
	}

	@Override
	public Facture retrieveFacture(Long id) {
		return FactureRepository.findById(id).get(); 
	}

}
