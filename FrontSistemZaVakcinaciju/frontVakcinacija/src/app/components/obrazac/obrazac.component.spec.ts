import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObrazacComponent } from './obrazac.component';

describe('ObrazacComponent', () => {
  let component: ObrazacComponent;
  let fixture: ComponentFixture<ObrazacComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ObrazacComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ObrazacComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
