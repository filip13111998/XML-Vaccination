import { Component, OnInit } from '@angular/core';
import { InteresovanjeModel } from 'src/app/models/interesovanje';
import { InteresovanjeService } from 'src/app/services/interesovanje-service.service';

declare const Xonomy: any;
@Component({
  selector: 'app-interesovanje',
  templateUrl: './interesovanje.component.html',
  styleUrls: ['./interesovanje.component.css']
})
export class InteresovanjeComponent implements OnInit {

  constructor(private inser: InteresovanjeService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit() {
    let interesovanjeForm = document.getElementById("interesovanjeForm");
    let spec = this.inser.interService;
    Xonomy.render('<in:interesovanje xmlns:in="http://ftn.uns.ac.rs/interesovanje" xmlns:util="http://ftn.uns.ac.rs/util"> </in:interesovanje>', interesovanjeForm, spec);
  }

  send() {
    let text = Xonomy.harvest();
    const entity = new InteresovanjeModel(text);
    console.log(entity);

    // this.inser.sendXml(entity).subscribe(
    //   response=>{
    //     console.log(response);
    //   }
    // );
  }

}
