import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';  
import { Observable } from 'rxjs';
import { Rayon } from './models/rayon';
@Injectable({
  providedIn: 'root'
})
export class RayonService {
  private baseUrl = 'http://localhost:8081/SpringMVC/servlet/getRayons'; 
  private productsUrl='http://localhost:8081/SpringMVC/servlet/add-rayon';
  constructor(private http:HttpClient) { }
  private _getHeaders():HttpHeaders{
    let header =new HttpHeaders({'Content_Type':'application/json'});
  return header;
  }
  httpOptions = {
    headers: new HttpHeaders({
    'Content-Type': 'application/json'
    })
    }

  getRayonList(): Observable<Rayon[]> {  
    return this.http.get<Rayon[]>("http://localhost:8081/SpringMVC/servlet/getRayons");  
  }  
  deleteRayon (ry: Rayon | number): Observable<Rayon> {
    const id = typeof ry === 'number' ? ry : ry.idRayon;
    const url="http://localhost:8081/SpringMVC/servlet/remove-rayon/"+id;
    return this.http.delete<Rayon>(url);
    }
    getRayonById(id: number): Observable<Rayon> {
      return this.http.get<Rayon>("http://localhost:8081/SpringMVC/servlet/retrieve-rayon/"+ id);
     }
     updateRayon(id:number,ray:Rayon):Observable<Rayon>{
      return this.http.put<Rayon>("http://localhost:8081/SpringMVC/servlet/modify-rayon/"+ id, ray, this.httpOptions);

     }
     addRayon (ry: Rayon): Observable<Rayon> {
      return this.http.post<Rayon>(this.productsUrl, ry, this.httpOptions);
    let options={Headers:this._getHeaders()}
    };
}
