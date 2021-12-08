package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.DetailFacture;;

public interface IDetailFactureService {

	List<DetailFacture> retrieveAllDetailFacture();
	Long addDetailFacture(DetailFacture u);
	void deleteDetailFacture(Long id);
	DetailFacture updateDetailFacture(DetailFacture u);
	DetailFacture retrieveDetailFacture(Long id);
}
