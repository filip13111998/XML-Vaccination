import { ObrazacModel } from './../../../models/obrazac';
import { ObrazacService } from './../../../services/obrazac.service';
import { Component, OnInit } from '@angular/core';
import { InteresovanjeModel } from 'src/app/models/interesovanje';
import { InteresovanjeService } from 'src/app/services/interesovanje-service.service';


declare const Xonomy: any;
@Component({
  selector: 'app-vaccination',
  templateUrl: './vaccination.component.html',
  styleUrls: ['./vaccination.component.css']
})
export class VaccinationComponent implements OnInit {
  sendButtonIsClicked: Boolean = true;
  confirmCode: String = '';
  modalVariable: String = '';
  exampleModalCenter: String = '#exampleModalCenter';
  constructor(private inser: InteresovanjeService, private obrazacser: ObrazacService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit() {
    let interesovanjeForm = document.getElementById("vaccForm");
    let spec = this.inser.interService;
    Xonomy.render('<in:interesovanje xmlns:in="http://ftn.uns.ac.rs/interesovanje" xmlns:util="http://ftn.uns.ac.rs/util"><in:drzavljanin>drzavljaninSrbije</in:drzavljanin> </in:interesovanje>', interesovanjeForm, spec);
  }


  public send() {
    if (this.sendButtonIsClicked) {
      let text = Xonomy.harvest();
      const entity = new InteresovanjeModel(text);
      // console.log(entity);
      console.log("INTERESOVANJE");
      this.sendButtonIsClicked = false;

    }
    else {
      this.exampleModalCenter = "#";
      let text = Xonomy.harvest();
      const entity = new ObrazacModel(text);
      // console.log(entity);
      console.log("OBRAZAC");
    }

  }

  public printCode() {
    // console.log(this.confirmCode);
    if (this.confirmCode === '') {
      return;
    }
    if (this.confirmCode === 'aaa') {
      console.log("BRAO");

      this.modalVariable = "modal";



      this.renderObrazac();
    }
    else {
      alert("Wrong code!");
    }
  }

  public renderObrazac() {
    let obrForm = document.getElementById("vaccForm");
    let spec = this.obrazacser.obrService;
    // Ovaj text ce biti text koji ce biti dobavljen sa servera i koji ce biti prosledjen xonomy render kako korisnik ne bi morao formu da popunjava od pocetka
    let text: String = '';
    Xonomy.render(`<ob:obrazac xmlns:ob="http://ftn.uns.ac.rs/obrazac" xmlns:util="http://ftn.uns.ac.rs/util"> ${text}</ob:obrazac>`, obrForm, spec);

  }

}
