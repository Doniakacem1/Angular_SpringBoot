package com.example.demo.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table( name = "Stock")
public class Stock implements Serializable {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private Long idStock;
	private int qteStock;
	private int qteMin;
	private String libelleStock;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="stock")
	private Set <Produit> produits;
	public Long getIdStock() {
		return idStock;
	}
	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}
	public int getQteStock() {
		return qteStock;
	}
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}
	public int getQteMin() {
		return qteMin;
	}
	public void setQteMin(int qteMin) {
		this.qteMin = qteMin;
	}
	public String getLibelleStock() {
		return libelleStock;
	}
	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
	}
	public Stock(Long idStock, int qteStock, int qteMin, String libelleStock) {
		super();
		this.idStock = idStock;
		this.qteStock = qteStock;
		this.qteMin = qteMin;
		this.libelleStock = libelleStock;
	}
	public Stock() {
		super();
		
	}
	
}
