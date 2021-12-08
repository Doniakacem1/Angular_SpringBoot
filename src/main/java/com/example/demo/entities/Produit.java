package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.*;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table( name = "Produit")
public class Produit implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idProduit")
	private Long idProduit;
	private String codeProduit;
	private String LibelleProduit;
	private float prixUnitaire;
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;

	@ManyToOne(cascade = CascadeType.ALL)
	private Rayon rayon;

	@ManyToOne(cascade = CascadeType.ALL)
	private Stock stock;

	@OneToOne
	private DetailProduit detail ; 

	@OneToMany(cascade = CascadeType.ALL,mappedBy="produit")
	private Set<DetailFacture> detailfacture;
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getLibelleProduit() {
		return LibelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		LibelleProduit = libelleProduit;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Produit(Long idProduit, String codeProduit, String libelleProduit, float prixUnitaire) {
		super();
		this.idProduit = idProduit;
		this.codeProduit = codeProduit;
		LibelleProduit = libelleProduit;
		this.prixUnitaire = prixUnitaire;
	}
	public Produit() {
		super();
		
	}
	public Rayon getRayon() {
		return rayon;
	}
	public void setRayon(Rayon rayon) {
		this.rayon = rayon;
	}
	public Stock getStock() {
		return stock;
	}
	public void setStock(Stock stock) {
		this.stock = stock;
	}
	public DetailProduit getDetail() {
		return detail;
	}
	public void setDetail(DetailProduit detail) {
		this.detail = detail;
	}
	
	
	
}
