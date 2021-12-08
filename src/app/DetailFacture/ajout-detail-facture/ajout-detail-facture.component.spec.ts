import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutDetailFactureComponent } from './ajout-detail-facture.component';

describe('AjoutDetailFactureComponent', () => {
  let component: AjoutDetailFactureComponent;
  let fixture: ComponentFixture<AjoutDetailFactureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutDetailFactureComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutDetailFactureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
