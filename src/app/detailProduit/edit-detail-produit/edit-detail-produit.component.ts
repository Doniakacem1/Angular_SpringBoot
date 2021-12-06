import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { DetailProduit } from 'src/app/models/detail-produit';
import { Produit } from 'src/app/models/produit';
import { DetailsProduitService } from 'src/app/services/details-produit.service';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-edit-detail-produit',
  templateUrl: './edit-detail-produit.component.html',
  styleUrls: ['./edit-detail-produit.component.sass']
})
export class EditDetailProduitComponent implements OnInit {
  listdp : DetailProduit [] ;
  DetailProduit : DetailProduit;  
  list : Produit [];
  paramater : number ;
  constructor(private ps:DetailsProduitService ,private xz: ProduitService , private routers : Router ,private ac : ActivatedRoute) { }
  
  submitted = false; 
  ngOnInit(): void {
    this.ac.params.subscribe(params=>
      {
        this.paramater=params['id'];
      })
   
      this.getDetailProduitById();
      this.getAllProduit();
    }  
  save3() {  
    this.ps.UpdateDetailProduit(this.DetailProduit)  
      .subscribe(data => {
        console.log(data)    
        this.routers.navigate(['/DetailProduit']);
      },error => console.log(error)
      );  
    
    
  }  
  
  getDetailProduitById()
  {this.ps.getDetailProduitById(this.paramater).subscribe(
    (res) => {
      console.log(res);
      this.DetailProduit = res;
    }
  );

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