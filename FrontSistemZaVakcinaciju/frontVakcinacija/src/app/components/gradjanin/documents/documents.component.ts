import { Component, OnInit } from '@angular/core';
import { TempModel } from 'src/app/models/temp';

@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.css']
})
export class DocumentsComponent implements OnInit {

  tempArr: TempModel[] = new Array();
  columns: String[] = ['#', 'ID', 'View', 'HTML', 'PDF'];
  metadataColumns: String[] = ['#', 'ID', 'RDF', 'JSON'];
  constructor() { }

  ngOnInit(): void {
    this.addTemps();
  }

  public addTemps() {
    this.tempArr.push(new TempModel("tekst1", "id11"));
    this.tempArr.push(new TempModel("tekst2", "ds"));
    this.tempArr.push(new TempModel("tekst3", "id13"));
    this.tempArr.push(new TempModel("tekst4", "id22"));
    this.tempArr.push(new TempModel("tekst5", "d49"));

  }

}
