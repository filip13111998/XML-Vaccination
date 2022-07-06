import { PotvrdaModel } from './../../../models/potvrda';
import { PotvrdaService } from './../../../services/potvrda.service';
import { Component, OnInit } from '@angular/core';
import { ObrazacModel } from './../../../models/obrazac';
import { ObrazacService } from './../../../services/obrazac.service';
// import { InteresovanjeModel } from 'src/app/models/interesovanje';
// import { InteresovanjeService } from 'src/app/services/interesovanje-service.service';
declare const Xonomy: any;
@Component({
  selector: 'app-med-vaccination',
  templateUrl: './med-vaccination.component.html',
  styleUrls: ['./med-vaccination.component.css']
})
export class MedVaccinationComponent implements OnInit {
  prikaz: Boolean = false;
  sendButtonIsClicked: Boolean = true;
  searchValue: string = '';
  confirmCode: String = '';
  modalVariable: String = '';
  textPotvrda: String = '';
  textObrazac: String = '';
  constructor(private pser: PotvrdaService, private obrazacser: ObrazacService) { }

  ngOnInit(): void {
  }

  ngAfterViewInit() {

    // let interesovanjeForm = document.getElementById("vaccForm");

    // let spec = this.inser.interService;
    // Xonomy.render('<in:interesovanje xmlns:in="http://ftn.uns.ac.rs/interesovanje" xmlns:util="http://ftn.uns.ac.rs/util"><in:drzavljanin>drzavljaninSrbije</in:drzavljanin> </in:interesovanje>', interesovanjeForm, spec);
    // let obrForm = document.getElementById("vaccForm");
    // let spec = this.obrazacser.obrService;
    // // Ovaj text ce biti text koji ce biti dobavljen sa servera i koji ce biti prosledjen xonomy render kako korisnik ne bi morao formu da popunjava od pocetka
    // // let textObrazac: String = '';
    // Xonomy.render(`<ob:obrazac xmlns:ob="http://ftn.uns.ac.rs/obrazac" xmlns:util="http://ftn.uns.ac.rs/util"> ${this.textObrazac}</ob:obrazac>`, obrForm, spec);

  }


  public send() {
    if (this.sendButtonIsClicked) {
      let text = Xonomy.harvest();
      const entity = new ObrazacModel(text);
      // console.log(entity);
      console.log("OBRAZAC");
      this.renderPotvrda();
      this.sendButtonIsClicked = false;
    } else {
      let text = Xonomy.harvest();
      const entity = new PotvrdaModel(text);
      // console.log(entity);
      console.log("POTVRDA");
      // this.renderPotvrda();
    }

  }

  // public printCode() {
  //   // console.log(this.confirmCode);
  //   if (this.confirmCode === '') {
  //     return;
  //   }
  //   if (this.confirmCode === 'aaa') {
  //     console.log("BRAO");
  //     this.modalVariable = "modal";

  //     this.renderPotvrda();
  //   }
  //   else {
  //     alert("Wrong code!");
  //   }
  // }
  public renderObrazac(): void {
    let obrForm = document.getElementById("vaccForm");
    let spec = this.obrazacser.obrService;
    // Ovaj text ce biti text koji ce biti dobavljen sa servera i koji ce biti prosledjen xonomy render kako korisnik ne bi morao formu da popunjava od pocetka
    // let textObrazac: String = '';
    Xonomy.render(`<ob:obrazac xmlns:ob="http://ftn.uns.ac.rs/obrazac" xmlns:util="http://ftn.uns.ac.rs/util"> ${this.textObrazac}</ob:obrazac>`, obrForm, spec);

  }

  public renderPotvrda() {
    let pForm = document.getElementById("vaccForm");
    let spec = this.pser.ptService;
    // Ovaj text ce biti text koji ce biti dobavljen sa servera i koji ce biti prosledjen xonomy render kako korisnik ne bi morao formu da popunjava od pocetka
    // let text: String = '';
    Xonomy.render(`<pt:potvrda xmlns:pt="http://ftn.uns.ac.rs/potvrda" xmlns:util="http://ftn.uns.ac.rs/util"> ${this.textPotvrda}</pt:potvrda>`, pForm, spec);

  }

  public searchObrazac(): void {
    if (this.searchValue === '000') {
      this.prikaz = true;
      // console.log("AE");
      this.textObrazac = "USPEO SAM";
      // console.log(this.textObrazac);
      this.renderObrazac();
    }


  }
}
