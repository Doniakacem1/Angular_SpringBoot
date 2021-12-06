import { Component, OnInit } from '@angular/core';
import { DetailsProduitService } from 'src/app/services/details-produit.service';
import { DetailProduit } from 'src/app/models/detail-produit';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ProduitService } from 'src/app/services/produit.service';
import { Produit } from 'src/app/models/produit';
import {  Router } from '@angular/router';

@Component({
  selector: 'app-add-detail-produit',
  templateUrl: './add-detail-produit.component.html',
  styleUrls: ['./add-detail-produit.component.sass']
})
export class AddDetailProduitComponent implements OnInit {
  DetailProduit : DetailProduit =new DetailProduit();  
  list : Produit [];

  constructor(private ps:DetailsProduitService ,private xz: ProduitService , private routers : Router) { }
  
  submitted = false; 
  ngOnInit(): void {
    this.submitted=false;  
    this.getAllProduit();
  }
  DetailProduitsaveform=new FormGroup({  
     
    idDetailProduit: new FormControl(),
    dateDernierModification: new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(5), Validators.pattern("[0-9]{4}")]),
    datecreation: new FormControl('', [Validators.required]),
    categorieProduit: new FormControl('', [Validators.required]),
   
  });  
  
  saveDetailProduit(saveDetailProduit){  
    this.DetailProduit=new DetailProduit();     
   
    this.DetailProduit.dateDernierModification = this.dateDernierModification.value;
    this.DetailProduit.datecreation = this.datecreation.value;
    this.DetailProduit.categorieProduit=this.categorieProduit.value;
   
    this.submitted = true;  
    
    this.save();  
  }  
  
    
  
  save() {  
    this.ps.createDP(this.DetailProduit)  
      .subscribe(data => {
        console.log(data)    
        this.routers.navigate(['/DetailProduit']);
      },error => console.log(error)
      );  
    
    this.DetailProduit = new DetailProduit();  
    
  }  
  
   get dateDernierModification(){  
    return this.DetailProduitsaveform.get('dateDernierModification');  
  }  
  get datecreation(){  
    return this.DetailProduitsaveform.get('datecreation');  
  }  
  get categorieProduit(){  
    return this.DetailProduitsaveform.get('categorieProduit');  
  }  
 
  
  addDetailProduitForm(){  
    this.submitted=false;  
    this.DetailProduitsaveform.reset();  
  }  
    
  getAllProduit() {
    this.xz.getAllProduit().subscribe(
      (res) => {
        console.log(res);
        this.list = res;
      }
    );
  }
}