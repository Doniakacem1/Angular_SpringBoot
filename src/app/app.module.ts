
import { ListdetailProduitComponent } from './detailProduit/listdetail-produit/listdetail-produit.component';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddProduitComponent } from './GestionProduit/add-produit/add-produit.component';
import { ListProduitComponent } from './GestionProduit/list-produit/list-produit.component';
import { UpdateProduitComponent } from './GestionProduit/update-produit/update-produit.component';
import { AddDetailProduitComponent } from './detailProduit/add-detail-produit/add-detail-produit.component';
import { EditDetailProduitComponent } from './detailProduit/edit-detail-produit/edit-detail-produit.component';





@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SidebarComponent,
    AddProduitComponent,
    ListProduitComponent,
    UpdateProduitComponent,
    ListdetailProduitComponent,
    AddDetailProduitComponent,
    EditDetailProduitComponent,
    

    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  
    ReactiveFormsModule,
    HttpClientModule,
 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
