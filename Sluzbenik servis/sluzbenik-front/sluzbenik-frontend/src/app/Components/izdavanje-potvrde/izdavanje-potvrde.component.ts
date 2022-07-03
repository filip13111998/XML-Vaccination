import { Component, OnInit } from '@angular/core';
import {XonomyService} from "../../Services/xonomy.service";

declare const Xonomy: any;

@Component({
  selector: 'app-izdavanje-potvrde',
  templateUrl: './izdavanje-potvrde.component.html',
  styleUrls: ['./izdavanje-potvrde.component.css']
})
export class IzdavanjePotvrdeComponent implements OnInit {

  constructor(private xonomyService:XonomyService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit(){

  }
}
