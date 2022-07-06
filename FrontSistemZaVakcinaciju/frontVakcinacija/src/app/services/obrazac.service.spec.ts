import { TestBed } from '@angular/core/testing';

import { ObrazacService } from './obrazac.service';

describe('ObrazacService', () => {
  let service: ObrazacService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ObrazacService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
