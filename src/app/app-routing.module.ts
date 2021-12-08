import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddClientComponent } from './add-client/add-client.component';
import { AddFournisseurComponent } from './add-fournisseur/add-fournisseur.component';
import { ClientListComponent } from './client-list/client-list.component';
import { EditClientComponent } from './edit-client/edit-client.component';
import { EditFournisseurComponent } from './edit-fournisseur/edit-fournisseur.component';
import { AddFactureComponent } from './facture/add-facture/add-facture.component';
import { ListFactureComponent } from './facture/list-facture/list-facture.component';
import { FournisseurListComponent } from './fournisseur-list/fournisseur-list.component';
import { ListProduitComponent } from './Produit/list-produit/list-produit.component';
import { RegisterComponent } from './register/register.component';
import { RouteGuardService } from './services/route-guard.service';
import { SigninComponent } from './signin/signin.component';

const routes: Routes = [
  { path: "facture", component: ListFactureComponent,canActivate:[RouteGuardService]  },
  {path:"addfacture",component:AddFactureComponent,canActivate:[RouteGuardService]},
  
  { path: 'view-Fournisseur', component: FournisseurListComponent,canActivate:[RouteGuardService] },  
  { path: 'add-Fournisseur', component: AddFournisseurComponent ,canActivate:[RouteGuardService]}, 
  { path: 'edit-Fournisseur', component: EditFournisseurComponent,canActivate:[RouteGuardService] },
  {path: "ListProduit", component: ListProduitComponent,canActivate:[RouteGuardService]},
  { path: 'add-client', component: AddClientComponent ,canActivate:[RouteGuardService]}, 
  { path: 'view-Client', component: ClientListComponent ,canActivate:[RouteGuardService]},
  { path: 'edit-Client', component: EditClientComponent,canActivate:[RouteGuardService]  },
  { path: 'login', component: SigninComponent },
  { path: 'register', component: RegisterComponent },
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }