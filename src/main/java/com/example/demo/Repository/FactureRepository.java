/*package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Facture;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface FactureRepository extends CrudRepository<Facture, Long> {
@Query("SELECT f FROM Facture f WHERE f.montantRemise=:montant")
List<Facture> retrieveFacutreByMontantRemise(@Param("montant") float montant);

//afficher le nombre total des facture activé
@Query(value="SELECT COUNT(*) FROM Facture  f WHERE f.active=:active  ")
long getNbFactureActive(@Param("active") Boolean active);

//afficher la liste des facture d'un client  
@Query("SELECT f FROM Facture f   WHERE   f.cl.idClient=:idClient")
List<Facture> getFacturesByClient(@Param("idClient")Long idClient);

}
*/