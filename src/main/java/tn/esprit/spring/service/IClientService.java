package tn.esprit.spring.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import tn.esprit.spring.DAO.entity.CategorieClient;
import tn.esprit.spring.DAO.entity.Client;
import tn.esprit.spring.DAO.entity.Profession;
import tn.esprit.spring.DAO.entity.Stock;

public interface IClientService  {

	
	
	List<Client> retrieveAllClients();

	Client addClient(Client c);

	Client updateClient(Client c);

	Client retrieveClient(Long id);
	 void deleteClient(Long id);
	List <Client>  retrieveClientsByProfession( Profession profession);
	Long updateClientCategorieByProfession(CategorieClient	categorieClient ,Profession profession);
	Long deleteClientByCategorieClientAndProfession(CategorieClient	categorieClient ,Profession profession);
	void insertClient(String nom, String prenom, Date dateNaissance, String email,String password, Profession profession,CategorieClient catClient);

}
