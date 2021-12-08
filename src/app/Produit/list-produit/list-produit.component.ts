import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Observable, Subject } from 'rxjs';
import { Produit } from 'src/app/models/produit';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-list-produit',
  templateUrl: './list-produit.component.html',
  styleUrls: ['./list-produit.component.sass']
})
export class ListProduitComponent implements OnInit {

constructor(private Produitservice:ProduitService) { }  
  
  FournisseurArray: any[] = [];  
  list:Produit[];
  dtTrigger: Subject<any>= new Subject();  
  
  Produits: Observable<Produit[]>;  
  Produit : Produit =new Produit();  
  deleteMessage=false;  
  Produitlist:any;  
  isupdated = false;   
  show:Boolean=false;
  myRay:Produit;   
   
  
  ngOnInit() {  
    this.isupdated=false;  
         
    this.Produitservice.getProduitList().subscribe(data =>{  
    this.Produits =data;  
    this.dtTrigger.next();  
    })  
  }  
    
  deleteProduit(id_Produit: number) {  
    this.Produitservice.deleteProduit(id_Produit)  
      .subscribe(  
        data => {  
          console.log(data);  
          this.deleteMessage=true;  
          this.Produitservice.getProduitList().subscribe(data =>{  
           this.Produits =data;  
            })  
        },  
        error => console.log(error));  
  }  
 
  
  Produitupdateform=new FormGroup({  
    idProduit:new FormControl(),  
    LibelleProduit:new FormControl(),  
    codeProduit:new FormControl(),  
    prixUnitaire:new FormControl(), 
  });  
  
  get idFournisseur(){  
    return this.Produitupdateform.get('idProduit');  
  }  
  
  get libelleFornisseur(){  
    return this.Produitupdateform.get('LibelleProduit');  
  }  
  
  get codeFornisseur(){  
    return this.Produitupdateform.get('codeProduit');  
  }  
  get prixUnitaire(){  
    return this.Produitupdateform.get('codeProduit');  
  }  
  
 
  
  changeisUpdate(){  
    this.isupdated=false;  
  }  
 
  showEdit(i:Produit){
    this.show=true;
    this.myRay=i;
  }
 updateProduit(i:Produit){
 for(let k in this.list){
   if(this.list[k].idProduit==i.idProduit){
     this.list[k]=i;
   }
 }
 
 }
 
 
 }