import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ObrazacModel } from '../models/obrazac';

declare const Xonomy: any;
@Injectable({
  providedIn: 'root'
})
export class ObrazacService {

  private path = "http://localhost:9797/saglasnost/saveMyObrazac"
  constructor(private http: HttpClient) { }

  sendXml(entity: ObrazacModel) {
    return this.http.post(this.path, entity);
  }

  public obrService = {


  }
}
