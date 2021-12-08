package tn.esprit.spring.service;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.DAO.entity.CategorieClient;
import tn.esprit.spring.DAO.entity.Client;
import tn.esprit.spring.DAO.entity.Profession;
import tn.esprit.spring.DAO.entity.Stock;
import tn.esprit.spring.DAO.repository.ClientRepository;


@Service
public class ClientServiceImpl implements IClientService {
	
	@Autowired
	ClientRepository clientrepository;

		
		/* public Client setclientforfacture (Long id)
		{
			Client c =this.clientrepository.getById(id);
			return c;
		} */
	@Override
	public List<Client> retrieveAllClients() {

		List<Client> cl =(List<Client> )clientrepository.findAll();

		for (Client c: cl){
			
			System.out.println("test");
		}
		return cl;

		}
		
	@Override
	public Client addClient(Client c) {
		return clientrepository.save(c);
	}

	@Override
	public Client updateClient(Client c) {
		clientrepository.save(c);	
		return c;
	}

	@Override
	public Client retrieveClient(Long id) {
		 return clientrepository.findById(id).get();
	}

	@Override
	public void deleteClient(Long id) {
		clientrepository.deleteById(id);
		
	}

	@Override
	public List <Client> retrieveClientsByProfession(Profession profession) {
		return clientrepository.retrieveClientsByProfession(profession);
	}

	@Override
	public Long updateClientCategorieByProfession(CategorieClient categorieClient, Profession profession) {
		return clientrepository.updateClientCategorieByProfession(categorieClient, profession);
		
		
	}

	@Override
	public Long deleteClientByCategorieClientAndProfession(CategorieClient categorieClient, Profession profession) {
		
       return clientrepository.deleteClientByCategorieClientAndProfession(categorieClient, profession);
	}

	@Override
	public void insertClient(String nom, String prenom, Date dateNaissance, String email, String password,	Profession profession, CategorieClient catClient) {
	clientrepository.insertClient(nom, prenom, dateNaissance, email, password, profession, catClient);
		
	}



	
}
