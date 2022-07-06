import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-gradjanin',
  templateUrl: './gradjanin.component.html',
  styleUrls: ['./gradjanin.component.css']
})
export class GradjaninComponent implements OnInit {

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
