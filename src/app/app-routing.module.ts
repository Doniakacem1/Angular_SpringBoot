import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddDetailProduitComponent } from './detailProduit/add-detail-produit/add-detail-produit.component';
import { EditDetailProduitComponent } from './detailProduit/edit-detail-produit/edit-detail-produit.component';
import { ListdetailProduitComponent } from './detailProduit/listdetail-produit/listdetail-produit.component';
import { AddProduitComponent } from './GestionProduit/add-produit/add-produit.component';
import { ListProduitComponent } from './GestionProduit/list-produit/list-produit.component';
import { UpdateProduitComponent } from './GestionProduit/update-produit/update-produit.component';

const routes: Routes = [
  {path:"Produit",component:ListProduitComponent} ,
  {path:"DetailProduit", component:ListdetailProduitComponent},
  {path:"addDetailProduit",component:AddDetailProduitComponent},
{path:"updateDetailProduit/:id",component:EditDetailProduitComponent},
{path:"addProduit",component:AddProduitComponent},
{path: "updateproduit/:id", component:UpdateProduitComponent},

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
