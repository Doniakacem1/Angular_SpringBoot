import { Component, OnInit } from '@angular/core';
import {  Router } from '@angular/router';
import { DetailProduit } from 'src/app/models/detail-produit';
import { DetailsProduitService } from 'src/app/services/details-produit.service';

@Component({
  selector: 'app-listdetail-produit',
  templateUrl: './listdetail-produit.component.html',
  styleUrls: ['./listdetail-produit.component.sass']
})
export class ListdetailProduitComponent implements OnInit {

  list: DetailProduit[];
  listInitiale: DetailProduit[];
  show:Boolean = false;
  myDetailProd: DetailProduit;
  constructor(private df:DetailsProduitService, private ac : Router) { }

  ngOnInit(): void {
    this.df.getAllDetailProduit().subscribe(res => {
      this.list = res;
      console.log(this.list);
      

    })
  }
  updateDetailProduit(i:number){
   this.ac.navigate(["/updateDetailProduit",i]);
  }
  deleteDetailProduit(j: number,i:number) {
    this.list.splice(i, 1);
    this.df.deleteDetailProduit(j).subscribe();
  }

 
}
