package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table( name = "Fournisseur")
public class Fournisseur implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idFournisseur")
	private Long idFournisseur;
	private String codeFornisseur;
	private String LibelleFornisseur;
	public Long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getCodeFornisseur() {
		return codeFornisseur;
	}
	public void setCodeFornisseur(String codeFornisseur) {
		this.codeFornisseur = codeFornisseur;
	}
	public String getLibelleFornisseur() {
		return LibelleFornisseur;
	}
	public void setLibelleFornisseur(String libelleFornisseur) {
		LibelleFornisseur = libelleFornisseur;
	}
	public Fournisseur(Long idFournisseur, String codeFornisseur, String libelleFornisseur) {
		super();
		this.idFournisseur = idFournisseur;
		this.codeFornisseur = codeFornisseur;
		LibelleFornisseur = libelleFornisseur;
	}
	public Fournisseur() {
		super();
	}
	
}
