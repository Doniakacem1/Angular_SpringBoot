package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DetailFactureRepository;

import com.example.demo.entities.DetailFacture;;

@Service
public class DetailFactureServiceImpl implements IDetailFactureService {

	@Autowired
	DetailFactureRepository DetailFactureRepository;

	@Override
	public List<DetailFacture> retrieveAllDetailFacture() {
		List<DetailFacture> DetailFacture=(List<DetailFacture>) DetailFactureRepository.findAll();
		for(DetailFacture p : DetailFacture){
			System.out.println(p);
		}
		return DetailFacture;
	}

	@Override
	public Long addDetailFacture(DetailFacture u) {
		DetailFactureRepository.save(u); 
		return u.getIdDetailFacture();
	}

	@Override
	public void deleteDetailFacture(Long id) {
		DetailFactureRepository.deleteById(id);
		
	}

	@Override
	public DetailFacture updateDetailFacture(DetailFacture u) {
		DetailFactureRepository.save(u); 
		return u;
	}

	@Override
	public DetailFacture retrieveDetailFacture(Long id) {
		return DetailFactureRepository.findById(id).get(); 
	}
}
