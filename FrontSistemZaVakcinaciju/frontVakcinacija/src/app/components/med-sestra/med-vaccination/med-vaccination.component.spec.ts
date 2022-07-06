import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MedVaccinationComponent } from './med-vaccination.component';

describe('MedVaccinationComponent', () => {
  let component: MedVaccinationComponent;
  let fixture: ComponentFixture<MedVaccinationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MedVaccinationComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MedVaccinationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
