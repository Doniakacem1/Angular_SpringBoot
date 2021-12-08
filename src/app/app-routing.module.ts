import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { ListFactureComponent } from './facture/list-facture/list-facture.component';
import { ListDetailFactureComponent } from './DetailFacture/list-detail-facture/list-detail-facture.component';
import { AjoutDetailFactureComponent } from './DetailFacture/ajout-detail-facture/ajout-detail-facture.component';
import { AddFactureComponent } from './facture/add-facture/add-facture.component';

const routes: Routes = [
  { path: "facture", component: ListFactureComponent },
  {path:"addfacture",component:AddFactureComponent},
  { path: "detailfacture", component: ListDetailFactureComponent },
  { path: "adddetail", component: AjoutDetailFactureComponent } 

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
