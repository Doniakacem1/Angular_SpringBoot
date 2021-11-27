import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Rayon } from '../models/rayon';
import { RayonService } from '../rayon.service';

@Component({
  selector: 'app-rayon',
  templateUrl: './rayon.component.html',
  styleUrls: ['./rayon.component.sass']
})
export class RayonComponent implements OnInit {
rayons:Rayon[];
MyRayons:Rayon;
  constructor(private rs:RayonService, private ac:ActivatedRoute) { }

  ngOnInit(): void {
    this.rs.getRayonList().subscribe((ry)=>this.rayons=ry);// nparcouri biha liste eli mawjouda fel bd
    this.ac.paramMap.subscribe(next=>this.rs.getRayonById(Number(next.get(
      'id'))).subscribe(res=>{this.MyRayons=res}), error=>console.log(error));
  }

  //i id de rayon ; j index de rayon dans la list angular 
  deleteRayon(i : number , j : number){
this.rs.deleteRayon(i).subscribe();
this.rayons.splice(j,1);

  }

}