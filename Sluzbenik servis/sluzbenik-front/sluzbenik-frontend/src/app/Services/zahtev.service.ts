import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";

declare const Xonomy:any;

@Injectable({
  providedIn: 'root'
})

export class ZahtevService {

  constructor(private http:HttpClient) {
  }

  postZahtev(body:any) {
    console.log(body)
    const headers = new HttpHeaders({ 'Content-Type': 'application/xml' });
    return this.http.post('http://localhost:9090/zahtev',  body, { headers: headers });
      // {headers: this.headers, responseType: 'text'});
  }
}
