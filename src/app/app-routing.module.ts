import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddFactureComponent } from './facture/add-facture/add-facture.component';
import { ListFactureComponent } from './facture/list-facture/list-facture.component';

const routes: Routes = [
  { path: "facture", component: ListFactureComponent },
  {path:"addfacture",component:AddFactureComponent},

];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
