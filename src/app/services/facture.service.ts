import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Facture} from '../models/facture';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class FactureService {
  list: Facture[];
  
  constructor(private _http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
    'Content-Type': 'application/json'
    })
    }
  getAllFacture(): Observable<Facture[]>{
    
    return this._http.get<Facture[]>("http://localhost:8081/SpringMVC/servlet/getFactures");

  }
  deleteFacture(facture: Facture | number): Observable<Facture> {
    const id = typeof  facture === 'number' ? facture : facture.idFacture;
    const url="http://localhost:8081/SpringMVC/servlet/remove-facture/"+'/'+id;
    return this._http.delete<Facture>(url);
  }

  getFactureById(id: number): Observable<Facture> {
    const url="    http://localhost:8081/SpringMVC/servlet/modify-facture"+'/'+id;

    return this._http.get<Facture>(url);
  }
  
  addFacture(facture: Facture): Observable<Facture> {
   
      return this._http.post<Facture>("http://localhost:8081/SpringMVC/servlet/add-facture/", facture, this.httpOptions);}
}
