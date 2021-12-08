package tn.esprit.spring.DAO.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table( name = "DetailProduit")
public class DetailProduit {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailProduit")
private long idDetailProduit;
	@Temporal(TemporalType.DATE) // indiquer que le champs est de type date n'importiw java.utile
	private Date dateDernierModification;
	@Temporal(TemporalType.DATE) 
	private Date datecreation;
	@Enumerated(EnumType.STRING)
	private CategorieProduit categorieProduit;
	
	@JsonIgnore
	@OneToOne (mappedBy="detailproduit")
	private Produit produit;
	
	
	
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public DetailProduit() {
		super();
	}
	
	public DetailProduit(long idDetailProduit, Date dateDernierModification, Date datecreation,
			CategorieProduit categorieProduit, Produit produit) {
		super();
		this.idDetailProduit = idDetailProduit;
		this.dateDernierModification = dateDernierModification;
		this.datecreation = datecreation;
		this.categorieProduit = categorieProduit;
		this.produit = produit;
	}
	public long getIdDetailProduit() {
		return idDetailProduit;
	}
	public void setIdDetailProduit(long idDetailProduit) {
		this.idDetailProduit = idDetailProduit;
	}
	public Date getDateDernierModification() {
		return dateDernierModification;
	}
	public void setDateDernierModification(Date dateDernierModification) {
		this.dateDernierModification = dateDernierModification;
	}
	public CategorieProduit getCategorieProduit() {
		return categorieProduit;
	}
	public void setCategorieProduit(CategorieProduit categorieProduit) {
		this.categorieProduit = categorieProduit;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
