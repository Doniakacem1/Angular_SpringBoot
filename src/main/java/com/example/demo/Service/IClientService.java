package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Profession;

public interface IClientService {

	List<Client> retrieveAllClient();
	Long addClient(Client u);
	void deleteClient(Long id);
	Client updateClient(Client u);
	Client retrieveClient(Long id);
	List<Client> retrieveClientsByProfession(Profession profession);
	Long updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession);
	Long deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession);
	void insertClient(String nom,String prenom,Date dateNaissance,String email,String password,Profession profession,CategorieClient categorieClient);
}
