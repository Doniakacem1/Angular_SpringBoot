
package com.example.demo.Repository;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CategorieClient;
import com.example.demo.entities.Client;
import com.example.demo.entities.Profession;


@Repository
public interface ClientRepository  extends CrudRepository<Client, Long>{
@Query("SELECT c FROM Client c WHERE c.profession= :profession")
List<Client> retrieveClientsByProfession(@Param("profession") Profession
profession);


@Modifying
@Query("update Client c set c.catClient = :categorie where c.profession =:profession")
Long updateClientCategorieByProfession(@Param("categorie") CategorieClient
catClient, @Param("profession") Profession profession);

@Modifying
@Query("DELETE FROM Client c WHERE c.catClient= :categorie AND c.profession = :profession")
Long deleteClientByCategorieClientAndProfession(@Param("categorie")
CategorieClient catClient, @Param("profession") Profession profession);


@Modifying
@Query(value = "INSERT INTO Client (nom, prenom,date_naissance,email,password,profession,catClient) VALUES (:nom,:prenom, :date_naissance, :email, :password, :profession, :catClient)",nativeQuery = true)
void insertClient(@Param("nom") String nom, @Param("prenom") String prenom,@Param("date_naissance") Date dateNaissance, @Param("email") String email,
@Param("password") String password, @Param("profession")  Profession profession, @Param("catClient") CategorieClient catClient);



}