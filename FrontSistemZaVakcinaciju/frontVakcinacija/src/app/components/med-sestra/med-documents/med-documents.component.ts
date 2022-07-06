import { Component, OnInit } from '@angular/core';
import { TempModel } from 'src/app/models/temp';
@Component({
  selector: 'app-med-documents',
  templateUrl: './med-documents.component.html',
  styleUrls: ['./med-documents.component.css']
})
export class MedDocumentsComponent implements OnInit {
  prikaz: Boolean = false;
  tempArr: TempModel[] = new Array();
  columns: String[] = ['#', 'ID', 'View', 'HTML', 'PDF'];
  metadataColumns: String[] = ['#', 'ID', 'RDF', 'JSON'];
  searchValue: String = '';

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

  public searchDocumentAndMetadata(): void {
    if (this.tempArr.length > 0) {
      this.prikaz = true;
    }
    // this.prikaz = true;
    console.log(this.searchValue);
  }

}
