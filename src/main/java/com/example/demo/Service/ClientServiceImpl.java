package com.example.demo.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ClientRepository;
import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Profession;


@Service
public class ClientServiceImpl implements IClientService {

	@Autowired
	ClientRepository ClientRepository;
	@Override
	public List<Client> retrieveAllClient() {
		List<Client> client=(List<Client>) ClientRepository.findAll();
		for(Client p : client){
			System.out.println(p);
		}
		return client;
	}

	@Override
	public Long addClient(Client u) {
		ClientRepository.save(u); 
		return u.getIdClient();
	}

	@Override
	public void deleteClient(Long id) {
		ClientRepository.deleteById(id);
		
	}

	@Override
	public Client updateClient(Client u) {
		ClientRepository.save(u); 
		return u;
	}

	@Override
	public Client retrieveClient(Long id) {
		return ClientRepository.findById(id).get(); 
	}

	@Override
	public List<Client> retrieveClientsByProfession(Profession profession) {
		List<Client> client=(List<Client>) ClientRepository.retrieveClientsByProfession(profession);
		return client;
		 }

	@Override
	public Long updateClientCategorieByProfession(CategorieClient catClient, Profession profession) {
		return ClientRepository.updateClientCategorieByProfession(catClient, profession);
		
	}

	@Override
	public Long deleteClientByCategorieClientAndProfession(CategorieClient catClient, Profession profession) {
		return ClientRepository.deleteClientByCategorieClientAndProfession(catClient, profession);
	} 

	@Override
	public void insertClient(String nom, String prenom, Date dateNaissance, String email, String password,
			Profession profession, CategorieClient catClient) {
		ClientRepository.insertClient(nom, prenom, dateNaissance, email, password, profession, catClient);
		
	}

}
