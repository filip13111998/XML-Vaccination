import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ZahtevSertifikatComponent } from './zahtev-sertifikat.component';

describe('ZahtevSertifikatComponent', () => {
  let component: ZahtevSertifikatComponent;
  let fixture: ComponentFixture<ZahtevSertifikatComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ZahtevSertifikatComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ZahtevSertifikatComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
