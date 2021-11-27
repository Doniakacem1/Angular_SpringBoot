import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddRayonComponent } from './add-rayon/add-rayon.component';
import { RayonComponent } from './rayon/rayon.component';

const routes: Routes = [

  {path:'Rayon',component:RayonComponent},
  
  {path:'AddRayon',component:AddRayonComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
