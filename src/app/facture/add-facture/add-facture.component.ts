import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Facture } from '../../models/facture';

@Component({
  selector: 'app-add-facture',
  templateUrl: './add-facture.component.html',
  styleUrls: ['./add-facture.component.sass']
})
export class AddFactureComponent implements OnInit {
  facture: Facture;
  form1: FormGroup;

  constructor() { }

  ngOnInit(): void {
    this.form1 = new FormGroup({
      idFacture: new FormControl('', Validators.required,),
      montantRemise: new FormControl('', [Validators.required, Validators.minLength(8), Validators.maxLength(8), Validators.pattern("[a-zA-Z-0-9]{8}")]),
      dateFacture: new FormControl('', [Validators.required, Validators.minLength(3)]),
      active: new FormControl('', [Validators.required, Validators.minLength(3)]),
      montantFacture: new FormControl('', [Validators.required, Validators.pattern("[1-9][0-9]*")])
    });

  }
  get idC (){return this.form1.get('id');};
  get montantRemiseF (){return this.form1.get('montantRemise');};
  get montantF (){return this.form1.get('montantFacture');};
  get dateF() { return this.form1.get('dateFacture'); }
  get Active() { return this.form1.get('active'); }

}
