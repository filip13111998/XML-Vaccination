import { Component, OnInit } from '@angular/core';
import { ObrazacModel } from 'src/app/models/obrazac';
import { ObrazacService } from 'src/app/services/obrazac.service';
declare const Xonomy : any;
@Component({
  selector: 'app-obrazac',
  templateUrl: './obrazac.component.html',
  styleUrls: ['./obrazac.component.css']
})
export class ObrazacComponent implements OnInit {

  constructor(private obs:  ObrazacService) { }

  ngOnInit(): void {
  }


  ngAfterViewInit(){
    let obrazacForm = document.getElementById("obrazacForm"); 
    let spec = this.obs.obrService;
    Xonomy.render('<obrazac> </obrazac>',obrazacForm,spec);
  }

  send() {
    let text = Xonomy.harvest();
    const entity = new ObrazacModel(text);
    console.log(entity);
    this.obs.sendXml(entity).subscribe(
      response=>{
        console.log(response);
      }
    );
  }
}
