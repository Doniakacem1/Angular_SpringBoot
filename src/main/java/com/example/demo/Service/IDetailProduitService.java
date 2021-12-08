package com.example.demo.Service;

import java.util.List;

import com.example.demo.entities.DetailProduit;;

public interface IDetailProduitService {

	List<DetailProduit> retrieveAllDetailProduit();
	Long addDetailProduit(DetailProduit u);
	void deleteDetailProduit(Long id);
	DetailProduit updateDetailProduit(DetailProduit u);
	DetailProduit retrieveDetailProduit(Long id);
}
