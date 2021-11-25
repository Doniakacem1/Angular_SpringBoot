import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Facture } from '../../models/facture';
import { FactureService } from '../../services/facture.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-facture',
  templateUrl: './add-facture.component.html',
  styleUrls: ['./add-facture.component.sass']
})
export class AddFactureComponent implements OnInit {
  facture: Facture;
  form1: FormGroup;

  constructor(private ps:FactureService,private router:Router) { }

  ngOnInit(): void {
    this.form1 = new FormGroup({
      idFacture: new FormControl('', Validators.required,),
      montantRemise: new FormControl('', [Validators.required, Validators.minLength(2), Validators.maxLength(8), Validators.pattern("[0-9]{8}")]),
      dateFacture: new FormControl('', [Validators.required,Validators.pattern("(0[1-9]|1[0-2])\/(0[1-9]|[1-2][0-9]|3[0-1])\/[0-9]{4}")]),
      active: new FormControl('', [Validators.required]),
      montantFacture: new FormControl('', Validators.required,)
    });

  }
  get idC (){return this.form1.get('idFacture');};
  get montantRemiseF (){return this.form1.get('montantRemise');};
  get montantF (){return this.form1.get('montantFacture');};
  get dateF() { return this.form1.get('dateFacture'); }
  get Active() { return this.form1.get('active'); }
  save() {
    console.log(this.form1.value);

    this.ps.addFacture(this.facture).subscribe (res => {
    console.log('Facture created!');
    this.router.navigateByUrl('/facture');})
    ;
    }
}
