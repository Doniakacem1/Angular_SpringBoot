import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { DetailFacture } from '../models/detail-facture';

@Injectable({
  providedIn: 'root'
})
export class DetailFactureService {
  list: DetailFacture[];
  private baseUrl = 'http://localhost:8081/SpringMVC/servlet/'; 
  httpOptions = { headers: new HttpHeaders({
    'Content-Type': 'application/json'})}
  constructor(private _http: HttpClient) { }

  getAllDetailFacture(): Observable<DetailFacture[]>{
    
    return this._http.get<DetailFacture[]>("http://localhost:8081/SpringMVC/servlet/getAllDetailFacture");

  }
  deleteFacture(detailfacture: DetailFacture | number):Observable<DetailFacture> {
    const id = typeof  detailfacture === 'number' ? detailfacture : detailfacture.idDetailFacture;
    const url="http://localhost:8081/SpringMVC/servlet/remove-DF/"+'/'+id;
    return this._http.delete<DetailFacture>(url);
  }
  UpdateDetailFacture(detailfacture: DetailFacture): Observable<DetailFacture> {
   
    return this._http.put<DetailFacture>('http://localhost:8081/SpringMVC/servlet/modify-DF',DetailFacture);
   }

   updateF(DetailFacture: object): Observable<object> {  
    return this._http.put(`${this.baseUrl}`+'modify-DF', DetailFacture,this.httpOptions);  
  } 
  createF(DetailFacture: object): Observable<object> {  
    return this._http.post(`${this.baseUrl}`+'add-DetailFacture', DetailFacture);  
  } 
}
