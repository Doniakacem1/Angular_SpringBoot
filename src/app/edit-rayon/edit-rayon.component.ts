import { Component, OnInit ,Output,EventEmitter, Input} from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Rayon } from '../models/rayon';
@Component({
  selector: 'app-edit-rayon',
  templateUrl: './edit-rayon.component.html',
  styleUrls: ['./edit-rayon.component.sass']
})
export class EditRayonComponent implements OnInit {
  myForm : FormGroup;
  @Input() rayonToEdit:Rayon;
  @Output() edited = new EventEmitter<Rayon>();
  constructor() { }

  ngOnInit(): void {
  }
  edit(){
    console.log(this.myForm.getRawValue());
    this.edited.emit(this.myForm.getRawValue());
    this.myForm.reset();
  }
}
