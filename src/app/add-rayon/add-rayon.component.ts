import { Component, OnInit ,EventEmitter,Output} from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';


import { FormControl, FormGroup, Validators ,NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { RayonService } from '../rayon.service';

@Component({
  selector: 'app-add-rayon',
  templateUrl: './add-rayon.component.html',
  styleUrls: ['./add-rayon.component.sass']
})
export class AddRayonComponent implements OnInit {
  MyForm:FormGroup;
  @Output() notif= new EventEmitter<any>();
  constructor(private rs:RayonService,private router:Router) { }

  ngOnInit(): void {
    //une instance de la classe formGroup(elle va regrouper un ensemble d'elements)
    this.MyForm=new FormGroup({ //equivalent a la balise <form>
      code: new FormControl('',[Validators.required,Validators.pattern("^[a-zA-Z0-9]{3,}?")]),
    
      libelle :new FormControl('',[Validators.required,Validators.pattern("^[a-zA-Z]{6,}?")]), // tekhou 1er argumetn eli howa  valeur par defaut w 2eme argument fiha les validateurs
sg:new FormGroup({

})

    });
  }
  get MyCode(){
    return this.MyForm.get('code');
  }
  save(f:NgForm){
    document.getElementById('add-rayon')?.click();
   this.rs.addRayon(f.value).subscribe(
       (next)=>{
         console.log(next)
         f.resetForm();
       },
       (error:HttpErrorResponse)=>{
         console.log(error.message)
       },
       ()=>{
         this.notif.emit();
       }
         )
         
       }
}
