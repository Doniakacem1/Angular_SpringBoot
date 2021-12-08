package tn.esprit.spring.service;

import java.util.List;
import java.util.Set;


import tn.esprit.spring.DAO.entity.DetailFacture;
import tn.esprit.spring.DAO.entity.Facture;




public interface IFactureService {

	public Facture addFacture(Facture f,Long idClient );
	 List<Facture> retrieveAllFacture();
	 Facture addFacture(Facture f);
	 void deleteFacture(Long id);
	 Facture cancelFacture(Long id);
	 Facture updateFacture(Facture f);
	 Facture retrieveFacture(Long id);
	 public long getNbFactureActive(); 
	  public long getNbFactureActive(Boolean active); 

		public float revenuDuMagasin();

	  List<Facture> getFacturesByClient(Long idClient);
	  Facture addDetailFacture(Facture f, Set<DetailFacture> detailsfacture);
	  List<Facture> findAll();
	
	
	
	
	
	
	
}
