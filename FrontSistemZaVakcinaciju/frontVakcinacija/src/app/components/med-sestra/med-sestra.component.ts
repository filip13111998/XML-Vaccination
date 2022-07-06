import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-med-sestra',
  templateUrl: './med-sestra.component.html',
  styleUrls: ['./med-sestra.component.css']
})
export class MedSestraComponent implements OnInit {

  prikaz: Boolean = false;
  koeficient: Number = 0;
  myRooter: Router;
  constructor(route: Router) {
    this.myRooter = route;
  }

  ngOnInit(): void {
  }

  public vaccationChangeKoef(): void {
    this.koeficient = 0;
  }

  public documentsChangeKoef(): void {
    this.koeficient = 1;
  }

  public metoda(): void {
    console.log("METODA");
  }

  public redirect(): void {
    this.myRooter.navigate(['/login']);
  }
}
