import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Encomenda } from '../model/Encomenda';

@Injectable({
  providedIn: 'root'
})
export class EncomendaService {

  constructor(private http: HttpClient) { }

  getByEncomenda(numeroRastreio : string):Observable<Encomenda>{
  return this.http.get<Encomenda>(`http://localhost:8080/encomenda/rastreio/${numeroRastreio}`)
  }
}
