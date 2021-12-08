package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.RayonRepository;

import com.example.demo.entities.Rayon;

@Service
public class RayonServiceImpl implements IRayonService{

	@Autowired
	RayonRepository RayonRepository;
	@Override
	public List<Rayon> retrieveAllRayon() {
		List<Rayon> Rayon=(List<Rayon>) RayonRepository.findAll();
		for(Rayon p : Rayon){
			System.out.println(p);
		}
		return Rayon;
	}

	@Override
	public Long addRayon(Rayon u) {
		RayonRepository.save(u); 
		return u.getIdRayon();
	}

	@Override
	public void deleteRayon(Long id) {
		RayonRepository.deleteById(id);
		
	}

	@Override
	public Rayon updateRayon(Rayon u) {
		RayonRepository.save(u); 
		return u;
	}

	@Override
	public Rayon retrieveRayon(Long id) {
		return RayonRepository.findById(id).get(); 
	}

}
