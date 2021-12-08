package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.Rayon;

public interface IRayonService {

	List<Rayon> retrieveAllRayon();
	Long addRayon(Rayon u);
	void deleteRayon(Long id);
	Rayon updateRayon(Rayon u);
	Rayon retrieveRayon(Long id);
	 List<Rayon> getRayons();
}
