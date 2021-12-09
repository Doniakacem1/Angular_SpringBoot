/*package com.example.demo.Service;

import java.util.Date;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ClientRepository;
import com.example.demo.Repository.DetailFactureRepository;
import com.example.demo.Repository.FactureRepository;
import com.example.demo.Repository.ProduitRepository;
import com.example.demo.entities.Client;
import com.example.demo.entities.DetailFacture;
import com.example.demo.entities.Facture;
import com.example.demo.entities.Produit;






@Service
public class FactureServiceImpl implements IFactureService {
@Autowired
FactureRepository facturerepository;
@Autowired
private FactureRepository iFactureRepositroy;
    @Autowired
    private ClientRepository ic;
    @Autowired
    private ProduitRepository iproduitRepository;
    @Autowired
    private DetailFactureRepository idfactureservice;
    @Autowired
ClientServiceImpl clientservice;
    @Autowired
IFactureService factureservice;

@Transactional
public Facture   addFacture(Facture f,Long idClient) {
Client c =ic.findById(idClient).get() ;
f.setDateFacture(new Date());
f.setActive(true);
f.setCl(c);
       
//f.setClientFacture(clientservice.setclientforfacture(idClient));
Set<DetailFacture> detailfacture = f.getDetails();
//System.out.println("afichageeeeeeeeeeeeeeeeeeeeeeeeeee"+detailfacture);
Facture fact = addDetailFacture(f,detailfacture);
return iFactureRepositroy.save(fact);


 

}
@Override
public List<Facture> retrieveAllFacture() {
List<Facture> factures =(List<Facture> )facturerepository.findAll();

for (Facture f: factures){

System.out.println("test");
}
return factures;
}

@Override
public Facture addFacture(Facture f) {
// f.setActive(true);
return facturerepository.save(f);
}

@Override
public void deleteFacture(Long id) {
facturerepository.deleteById(id);
}

@Override
public Facture updateFacture(Facture f) {
facturerepository.save(f);
return f;
}

@Override
public Facture retrieveFacture(Long id) {
return facturerepository.findById(id).get();
}

@Override
public Facture cancelFacture(Long id) {
Facture facture = facturerepository.findById(id).get();
facture.setActive(false);
return facturerepository.save(facture);

}

@Override
public long getNbFactureActive(Boolean active) {
long nb;
return nb = facturerepository.getNbFactureActive(active);
}

@Override
public List<Facture> getFacturesByClient(Long idClient) {
return (List<Facture>) facturerepository.getFacturesByClient(idClient);
}
@Override
public Facture addDetailFacture(Facture f, Set<DetailFacture> detailsfacture) {
float montantFacture = 0;
float montantRemise = 0;
for (DetailFacture detail : detailsfacture) {


Produit produit = iproduitRepository.findById(detail.getPro().getIdProduit()).get();
float prixTotaldetail = detail.getQte() * produit.getPrixUnitaire();
float montantRemiseDetail =(prixTotaldetail *detail.getPourcentageRemise())/100;
float prixTotaldetailRemise = prixTotaldetail - montantRemiseDetail ;
detail.setMontantRemise(montantRemiseDetail);
detail.setPrixTotatl(prixTotaldetailRemise);
montantFacture = montantFacture + prixTotaldetailRemise;
montantRemise= montantRemise+montantRemiseDetail;
detail.setPro(produit);
 detail.setDetailfacture(f);

idfactureservice.save(detail);
}
f.setMontantFacture(montantFacture);
f.setMontantRemise(montantRemise);



        return f;
}
@Override
public List<Facture> findAll() {


       return (List<Facture>) iFactureRepositroy.findAll();
   
}


@Override
@Scheduled(cron = "* * * 1 1 *")
public float revenuDuMagasin() {
List<Facture> factures = (List<Facture>) iFactureRepositroy.findAll();
float totalRevenue=0f;
for (Facture facture : factures) {
totalRevenue += facture.getMontantFacture() - facture.getMontantFacture()*facture.getMontantRemise();
}
System.out.println(totalRevenue);
return totalRevenue;
}
@Override
public long getNbFactureActive() {
// TODO Auto-generated method stub
return 0;
}
}
*/