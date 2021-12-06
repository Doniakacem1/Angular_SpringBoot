import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Produit } from 'src/app/models/produit';
import { Rayon } from 'src/app/models/Rayon';
import { Stock } from 'src/app/models/Stock';

import { ProduitService } from 'src/app/services/produit.service';

@Component({
  selector: 'app-add-produit',
  templateUrl: './add-produit.component.html',
  styleUrls: ['./add-produit.component.sass']
})
export class AddProduitComponent implements OnInit {

product : Produit = new Produit() ;  
list:Produit[];
listRayons : Rayon[];
listStock : Stock[];


constructor(private ps:ProduitService , private router: Router) { }

  ngOnInit(): void {
   this.product.rayon= new Rayon();
   this.product.stock=new Stock();
    this.getAllRayons();
    this.getAllStock();
  
  }
  saveProduit(){  
    this.product;
    console.log(this.product)
    this.ps.addProduit(this.product).subscribe(
      data => {
        console.log(data)    
        this.router.navigate(['/addProduit']);
      },error => console.log(error)
      );  
    

  }  
  getAllStock(){
    this.ps.getAllStocksFormDb().subscribe(
      data => {
        this.listStock = data ;
        console.log(this.listStock);
      }
    );
  }
  getAllRayons(){
    this.ps.getAllRayonsFormDb().subscribe(
      data => {
        this.listRayons = data ;
        console.log(this.listRayons);
      }
    );
  }
 
}
