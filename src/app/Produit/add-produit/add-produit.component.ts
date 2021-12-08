import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Produit } from 'src/app/models/produit';
import { Rayon } from 'src/app/models/rayon';
import { Stock } from 'src/app/models/stock';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-add-produit',
  templateUrl: './add-produit.component.html',
  styleUrls: ['./add-produit.component.sass']
})
export class AddProduitComponent implements OnInit {
  
  constructor(private ProduitService:ProduitService) { }
  produit : Produit=new Produit();  
  submitted = false; 
  ngOnInit(): void {
    this.submitted=false;  
  }
  Produitsaveform=new FormGroup({  
     
    ProduitLibelle:new FormControl('',[Validators.required]),  
    code2Produit:new FormControl()  
  });  
}