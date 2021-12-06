import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produit } from 'src/app/models/produit';
import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-list-produit',
  templateUrl: './list-produit.component.html',
  styleUrls: ['./list-produit.component.sass']
})
export class ListProduitComponent implements OnInit {

  list: Produit[];
  produit: Produit = new Produit();
  constructor(private ps:ProduitService,private router : Router) { }

  ngOnInit(): void {
    this.getAllProduit();
  }
  
  getAllProduit() {
    this.ps.getAllProduit().subscribe(
      (res) => {
        console.log(res);
        this.list = res;
      }
    );
  }
  deleteProduit(i: number) {
    this.ps.deleteProduit(i).subscribe((res) => {
      console.log(res);
      this.getAllProduit();
    });
  }
  UpdateProduit(id: number) {
    this.router.navigate(['/updateproduit',id]);
  }
  

}
