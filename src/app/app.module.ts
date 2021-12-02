import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RayonComponent } from './rayon/rayon.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SideBarComponent } from './side-bar/side-bar.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';  
import { HttpClientModule } from '@angular/common/http';
import { EditRayonComponent } from './edit-rayon/edit-rayon.component';
import { AddRayonComponent } from './add-rayon/add-rayon.component';
import { ListStockComponent } from './list-stock/list-stock.component';
import { AddStockComponent } from './add-stock/add-stock.component';
import { EditStockComponent } from './edit-stock/edit-stock.component';
import { Ng2OrderModule } from 'ng2-order-pipe';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
 


@NgModule({
  declarations: [
    AppComponent,
    RayonComponent,
    NavbarComponent,
    SideBarComponent,
    EditRayonComponent,
    AddRayonComponent,
    ListStockComponent,
    AddStockComponent,
    EditStockComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,  
    ReactiveFormsModule,  
    HttpClientModule,
    Ng2OrderModule,
    Ng2SearchPipeModule 
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
