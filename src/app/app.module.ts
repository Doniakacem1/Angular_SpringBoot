import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListFactureComponent } from './facture/list-facture/list-facture.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { HttpClientModule } from '@angular/common/http';

import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EditFactureComponent } from './facture/edit-facture/edit-facture.component';
import { CommonModule } from '@angular/common';
import { AddFactureComponent } from './facture/add-facture/add-facture.component';
import { ListDetailFactureComponent } from './DetailFacture/list-detail-facture/list-detail-facture.component';
import { EditDetailFactureComponent } from './DetailFacture/edit-detail-facture/edit-detail-facture.component';





@NgModule({
  declarations: [
    AppComponent,
    ListFactureComponent,
    NavbarComponent,
    SidebarComponent,
    EditFactureComponent,
    AddFactureComponent,
    ListDetailFactureComponent,
    EditDetailFactureComponent

    

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
   ReactiveFormsModule,
    HttpClientModule,
    CommonModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
