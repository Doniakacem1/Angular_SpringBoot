import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormArray, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Facture } from '../../models/facture';
import { FactureService } from '../../services/facture.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-add-facture',
  templateUrl: './add-facture.component.html',
  styleUrls: ['./add-facture.component.sass']
})
export class AddFactureComponent implements OnInit {
 
  constructor(private ps: FactureService, private fb: FormBuilder,) { }
  Facture: Facture = new Facture();
  submitted = false;
  ngOnInit(): void {
    this.submitted = false;
  }
  Facturesaveform = new FormGroup({
     
    idFacture: new FormControl(),
    montantRemise: new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(5), Validators.pattern("[0-9]{4}")]),
    dateFacture: new FormControl('', [Validators.required]),
    active: new FormControl('', [Validators.required]),
    montantFacture: new FormControl('', [Validators.required]),
  });
  
  saveFacture(saveFacture) {
    this.Facture = new Facture();
    this.Facture.montantRemise = this.montantR.value;
    this.Facture.dateFacture = this.dateF.value;
    this.Facture.active = this.active.value;
    this.Facture.montantFacture = this.montantF.value;
      
    this.submitted = true;
    this.save();
  }
  
    
  
  save() {
    this.ps.createF(this.Facture)
      .subscribe(data => console.log(data), error => console.log(error));
    this.Facture = new Facture();
  }
  
  get montantR() {
    return this.Facturesaveform.get('montantRemise');
  }
  
  get dateF() {
    return this.Facturesaveform.get('dateFacture');
  }
  get active() {
    return this.Facturesaveform.get('active');
  }
  get montantF() {
    return this.Facturesaveform.get('montantFacture');
  }
  
  
  
  addFactureForm() {
    this.submitted = false;
    this.Facturesaveform.reset();
  }
 

 
}