package com.example.demo.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "Facture")
@JsonIgnoreProperties("cl")

public class Facture {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idFacture")
private long idFacture;

private float montantRemise;
private float montantFacture;
@Temporal(TemporalType.DATE)
private Date dateFacture;
private boolean active;

@ManyToOne
Client cl;



@OneToMany(cascade = CascadeType.ALL, mappedBy = "detailfacture")
private Set<DetailFacture> details;

public Client getCl() {
return cl;
}

public void setCl(Client cl) {
this.cl = cl;
}
@JsonBackReference
public Set<DetailFacture> getDetails() {
return details;
}

public void setDetails(Set<DetailFacture> details) {
this.details = details;
}

public Facture() {
super();
}



public Facture(long idFacture, float montantRemise, float montantFacture, Date dateFacture, boolean active,
Client cl) {
super();
this.idFacture = idFacture;
this.montantRemise = montantRemise;
this.montantFacture = montantFacture;
this.dateFacture = dateFacture;
this.active = active;
this.cl = cl;

}

public long getIdFacture() {
return idFacture;
}

public void setIdFacture(long idFacture) {
this.idFacture = idFacture;
}

public float getMontantRemise() {
return montantRemise;
}

public void setMontantRemise(float montantRemise) {
this.montantRemise = montantRemise;
}

public float getMontantFacture() {
return montantFacture;
}

public void setMontantFacture(float montantFacture) {
this.montantFacture = montantFacture;
}

public Date getDateFacture() {
return dateFacture;
}

public void setDateFacture(Date dateFacture) {
this.dateFacture = dateFacture;
}

public boolean isActive() {
return active;
}

public void setActive(boolean active) {
this.active = active;
}


}