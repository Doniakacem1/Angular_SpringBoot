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
 


@NgModule({
  declarations: [
    AppComponent,
    RayonComponent,
    NavbarComponent,
    SideBarComponent,
    EditRayonComponent,
    AddRayonComponent,

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
