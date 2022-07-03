import { Component, OnInit } from '@angular/core';
import {XonomyService} from "../../Services/xonomy.service";
import {ZahtevService} from "../../Services/zahtev.service";

declare const Xonomy: any;

@Component({
  selector: 'app-zahtev-sertifikat',
  templateUrl: './zahtev-sertifikat.component.html',
  styleUrls: ['./zahtev-sertifikat.component.css']
})
export class ZahtevSertifikatComponent implements OnInit {

  constructor(private xonomyService:XonomyService, private zahtevService:ZahtevService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit(){
    let element = document.getElementById("editor");
    let specification = this.xonomyService.zahtevSpecification;
    let xmlString = '<zahtev xmlns="http://vakcinisanje.com"></zahtev>';
    Xonomy.render(xmlString,element,specification);
    console.log(Xonomy);
  }

  postZahtev(){
    let text = Xonomy.harvest();

    this.zahtevService.postZahtev(text).subscribe(
        (result: any) => {
        console.log(result)
      }
    );
  }
}
