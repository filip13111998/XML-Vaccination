import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedDocumentsComponent } from './med-documents.component';

describe('MedDocumentsComponent', () => {
  let component: MedDocumentsComponent;
  let fixture: ComponentFixture<MedDocumentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedDocumentsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MedDocumentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
