import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddRayonComponent } from './add-rayon/add-rayon.component';
import { AddStockComponent } from './add-stock/add-stock.component';
import { EditRayonComponent } from './edit-rayon/edit-rayon.component';
import { EditStockComponent } from './edit-stock/edit-stock.component';
import { ListStockComponent } from './list-stock/list-stock.component';
import { RayonComponent } from './rayon/rayon.component';

const routes: Routes = [

  {path:'Rayon',component:RayonComponent},
  
  {path:'AddRayon',component:AddRayonComponent},
  {path:'EditRayon/:idRayon',component:EditRayonComponent},
  {path:'listStock',component:ListStockComponent},
  {path:'AddStock',component:AddStockComponent},
  {path:'EditStock/:idStock',component:EditStockComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
