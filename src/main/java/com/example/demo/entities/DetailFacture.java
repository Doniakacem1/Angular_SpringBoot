package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name = "DetailFacture")
public class DetailFacture {
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idDetailFacture")
private long idDetailFacture;
private Integer qte;
private float prixTotatl;
private float pourcentageRemise;
private float montantRemise;

@ManyToOne
private Facture  detailfacture;
@ManyToOne
private Produit pro;



public DetailFacture() {
super();
}
public DetailFacture(long idDetailFacture, Integer qte, float prixTotatl, float pourcentageRemise,
float montantRemise) {
super();
this.idDetailFacture = idDetailFacture;
this.qte = qte;
this.prixTotatl = prixTotatl;
this.pourcentageRemise = pourcentageRemise;
this.montantRemise = montantRemise;
}
public long getIdDetailFacture() {
return idDetailFacture;
}
public void setIdDetailFacture(long idDetailFacture) {
this.idDetailFacture = idDetailFacture;
}
public Integer getQte() {
return qte;
}
public void setQte(Integer qte) {
this.qte = qte;
}
public float getPrixTotatl() {
return prixTotatl;
}
public void setPrixTotatl(float prixTotatl) {
this.prixTotatl = prixTotatl;
}
public float getPourcentageRemise() {
return pourcentageRemise;
}
public void setPourcentageRemise(float pourcentageRemise) {
this.pourcentageRemise = pourcentageRemise;
}
public float getMontantRemise() {
return montantRemise;
}
public void setMontantRemise(float montantRemise) {
this.montantRemise = montantRemise;
}
public Facture getDetailfacture() {
return detailfacture;
}
public void setDetailfacture(Facture detailfacture) {
this.detailfacture = detailfacture;
}
@JsonBackReference
public Produit getPro() {
return pro;
}
public void setPro(Produit pro) {
this.pro = pro;
}
@Override
public String toString() {
return "DetailFacture [idDetailFacture=" + idDetailFacture + ", qte=" + qte + ", prixTotatl=" + prixTotatl
+ ", pourcentageRemise=" + pourcentageRemise + ", montantRemise=" + montantRemise + ", detailfacture="
+ detailfacture + ", pro=" + pro + "]";
}



















}