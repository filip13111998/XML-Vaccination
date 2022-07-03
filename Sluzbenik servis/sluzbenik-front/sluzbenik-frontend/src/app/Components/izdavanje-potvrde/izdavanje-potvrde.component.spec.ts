import { ComponentFixture, TestBed } from '@angular/core/testing';

import { IzdavanjePotvrdeComponent } from './izdavanje-potvrde.component';

describe('IzdavanjePotvrdeComponent', () => {
  let component: IzdavanjePotvrdeComponent;
  let fixture: ComponentFixture<IzdavanjePotvrdeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ IzdavanjePotvrdeComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(IzdavanjePotvrdeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
