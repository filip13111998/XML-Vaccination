import { TestBed } from '@angular/core/testing';

import { InteresovanjeServiceService } from './interesovanje-service.service';

describe('InteresovanjeServiceService', () => {
  let service: InteresovanjeServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(InteresovanjeServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
