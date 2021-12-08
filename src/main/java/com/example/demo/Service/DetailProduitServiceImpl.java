package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DetailProduitRepository;

import com.example.demo.entities.DetailProduit;
@Service
public class DetailProduitServiceImpl implements IDetailProduitService {

	@Autowired
	DetailProduitRepository DetailProduitRepository;
	@Override
	public List<DetailProduit> retrieveAllDetailProduit() {
		List<DetailProduit> DetailProduit=(List<DetailProduit>) DetailProduitRepository.findAll();
		for(DetailProduit p : DetailProduit){
			System.out.println(p);
		}
		return DetailProduit;
	}

	@Override
	public Long addDetailProduit(DetailProduit u) {
		DetailProduitRepository.save(u); 
		return u.getIdDetailProduit();
	}

	@Override
	public void deleteDetailProduit(Long id) {
		DetailProduitRepository.deleteById(id);
		
	}

	@Override
	public DetailProduit updateDetailProduit(DetailProduit u) {
		DetailProduitRepository.save(u); 
		return u;
	}

	@Override
	public DetailProduit retrieveDetailProduit(Long id) {
		return 	DetailProduitRepository.findById(id).get(); 
	}

}
