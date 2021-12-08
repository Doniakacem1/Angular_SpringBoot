import { Component, OnInit } from '@angular/core';
import { DetailFactureService } from '../../services/detail-facture.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { DetailFacture } from '../../models/detail-facture';

@Component({
  selector: 'app-ajout-detail-facture',
  templateUrl: './ajout-detail-facture.component.html',
  styleUrls: ['./ajout-detail-facture.component.sass']
})
export class AjoutDetailFactureComponent implements OnInit {
  constructor(private ps:DetailFactureService) { }
  DetailFacture : DetailFacture=new DetailFacture();  
  submitted = false; 
  ngOnInit(): void {
    this.submitted=false;  
  }
  DetailFacturesaveform=new FormGroup({  
     
    idDetailFacture: new FormControl(),
      montantRemise: new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(5), Validators.pattern("[0-9]{4}")]),
      qte: new FormControl('', [Validators.required]),
      prixTotatl: new FormControl('', [Validators.required]),
      pourcentageRemise: new FormControl('', [Validators.required]), 
  });  
  
  saveDetailFacture(saveDetailFacture){  
    this.DetailFacture=new DetailFacture();     
    this.DetailFacture.montantRemise=this.montantR.value;  
    this.DetailFacture.qte = this.QuantiteF.value;
    this.DetailFacture. prixTotatl = this.prixF.value;
    this.DetailFacture.pourcentageRemise=this.pourcF.value;
      
    this.submitted = true;  
    this.save();  
  }  
  
    
  
  save() {  
    this.ps.createF(this.DetailFacture)  
      .subscribe(data => console.log(data), error => console.log(error));  
    this.DetailFacture = new DetailFacture();  
  }  
  
  get montantR(){  
    return this.DetailFacturesaveform.get('montantRemise');  
  }  
  
  get QuantiteF(){  
    return this.DetailFacturesaveform.get('qte');  
  }  
  get prixF(){  
    return this.DetailFacturesaveform.get('prixTotatl');  
  }  
  get pourcF(){  
    return this.DetailFacturesaveform.get('pourcentageRemise');  
  }  
  
  
  
  addFactureForm(){  
    this.submitted=false;  
    this.DetailFacturesaveform.reset();  
  }  

}
