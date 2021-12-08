import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Produit } from '../models/produit';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  private baseUrl = 'http://localhost:8081/SpringMVC/servlet/';  
  constructor(private http:HttpClient) { }
  getProduitList(): Observable<any> {  
    return this.http.get(`${this.baseUrl}`+'getAllProduit');  
  }  
  
  createProduit(Produit: object): Observable<object> {  
    return this.http.post(`${this.baseUrl}`+'add-produit', Produit);  
  }  
  
  deleteProduit(id: number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}delete-produit/${id}`, { responseType: 'text' });  
  }  
  
 
  updateProduit(four:Produit):Observable<Produit>{
    return this.http.put<Produit>("http://localhost:8081/SpringMVC/servlet/update-produit",four);
  }
  getProduit(id: number): Observable<Object> {  
    return this.http.get(`${this.baseUrl}getProduit/${id}`);  
  }  
}
