import { Component, OnInit } from '@angular/core';
import { PotvrdaModel } from 'src/app/models/potvrda';
import { PotvrdaService } from 'src/app/services/potvrda.service';
declare const Xonomy:any;
@Component({
  selector: 'app-potvrda',
  templateUrl: './potvrda.component.html',
  styleUrls: ['./potvrda.component.css']
})
export class PotvrdaComponent implements OnInit {

  constructor(private ps: PotvrdaService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit(){
    let potvrdaForm = document.getElementById("potvrdaForm"); 
    let spec = this.ps.ptService;
    Xonomy.render('<pt:potvrda xmlns:pt="http://ftn.uns.ac.rs/potvrda" xmlns:util="http://ftn.uns.ac.rs/util"> </pt:potvrda>',potvrdaForm,spec);
  }

  send() {
    let text = Xonomy.harvest();
    const entity = new PotvrdaModel(text);
    console.log(entity);
    // this.ps.sendXml(entity).subscribe(
    //   response=>{
    //     console.log(response);
    //   }
    // );
  }

}
