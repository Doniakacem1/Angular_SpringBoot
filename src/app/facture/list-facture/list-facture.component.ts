import { Component, OnInit } from '@angular/core';
import { Facture } from '../../models/facture';
import { FactureService } from '../../services/facture.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-list-facture',
  templateUrl: './list-facture.component.html',
  styleUrls: ['./list-facture.component.sass']
})
export class ListFactureComponent implements OnInit {
  list: Facture[];
  listInitiale: Facture[];
  show:Boolean = false;
  myFact: Facture;
  
  constructor(private us:FactureService, private ac:ActivatedRoute) { }

  ngOnInit(): void {
    this.us.getAllFacture().subscribe(res => {
      console.log(res)
      this.list = res;
      

    })
  }
  showEdit(i:Facture){
    // this.show=!this.show;
    this.show=true;
     this.myFact=i;
     //console.log(this.myInvoice);
   }

  deleteFacture(id: number,i:number) {
    this.list.splice(i, 1);
    this.us.deleteFacture(id).subscribe();
  }
  updateInvoice(i:Facture){
    for (let k in this.list){
      if (this.list[k].idFacture == i.idFacture){
        this.list[k]=i;
      }
    }
  }
}
