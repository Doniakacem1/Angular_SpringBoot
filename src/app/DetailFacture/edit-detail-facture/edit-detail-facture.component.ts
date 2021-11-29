import { Component, OnInit, Output, Input, EventEmitter, SimpleChanges } from '@angular/core';

import { Router } from '@angular/router';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { DetailFactureService } from 'src/app/services/detail-facture.service';
import { DetailFacture } from '../../models/detail-facture';

@Component({
  selector: 'app-edit-detail-facture',
  templateUrl: './edit-detail-facture.component.html',
  styleUrls: ['./edit-detail-facture.component.sass']
})
export class EditDetailFactureComponent implements OnInit {
  Facture : DetailFacture=new DetailFacture();  
  myForm : FormGroup;
  @Input() detailinvoiceToEdit : DetailFacture;
  @Input() prop2 : DetailFacture;
  @Output() edited = new EventEmitter<DetailFacture>();
  constructor(private ps:DetailFactureService,private router:Router) { }

  ngOnInit(): void {


    
    this.myForm=new FormGroup({
      idDetailFacture:new FormControl({"value":this.detailinvoiceToEdit.idDetailFacture, "disabled":true}),
      qte:new FormControl(this.detailinvoiceToEdit.qte, Validators.required),
      montantRemise: new FormControl(this.detailinvoiceToEdit.montantRemise),
      prixTotatl:new FormControl(this.detailinvoiceToEdit.prixTotatl),
      pourcentageRemise: new FormControl(this.detailinvoiceToEdit.pourcentageRemise)
    })
    
  }
  ngOnChanges(changes:SimpleChanges){
    /* this.myForm=new FormGroup({
       idInvoice:new FormControl(this.invoiceToEdit.idInvoice),
       dateBill:new FormControl(this.invoiceToEdit.dateBill),
       discountAmount: new FormControl(this.invoiceToEdit.discountAmount),
       Status:new FormControl(this.invoiceToEdit.Status),
       billAmount:new FormControl(this.invoiceToEdit.billAmount)
     })*/
     console.log(changes);
     if(!changes.detailinvoiceToEdit.firstChange){
     this.myForm.setControl('idDetailFacture',new FormControl(this.detailinvoiceToEdit.idDetailFacture));
     this.myForm.setControl('qte',new FormControl(this.detailinvoiceToEdit.qte));
     this.myForm.setControl('montantRemise',new FormControl(this.detailinvoiceToEdit.montantRemise));
     this.myForm.setControl('prixTotatl',new FormControl(this.detailinvoiceToEdit.prixTotatl));
     this.myForm.setControl('pourcentageRemise',new FormControl(this.detailinvoiceToEdit.pourcentageRemise));
     }
    
   }
  edit(){
    console.log(this.myForm.getRawValue());
    this.ps.updateF(this.myForm.getRawValue()).subscribe();
    this.edited.emit(this.myForm.getRawValue());
    this.myForm.reset();
  }
  


}
