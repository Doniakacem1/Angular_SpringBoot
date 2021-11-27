import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddRayonComponent } from './add-rayon/add-rayon.component';
import { AddStockComponent } from './add-stock/add-stock.component';
import { ListStockComponent } from './list-stock/list-stock.component';
import { RayonComponent } from './rayon/rayon.component';

const routes: Routes = [

  {path:'Rayon',component:RayonComponent},
  
  {path:'AddRayon',component:AddRayonComponent},
  {path:'listStock',component:ListStockComponent},
  {path:'AddStock',component:AddStockComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
