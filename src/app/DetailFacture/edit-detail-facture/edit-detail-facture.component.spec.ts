import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditDetailFactureComponent } from './edit-detail-facture.component';

describe('EditDetailFactureComponent', () => {
  let component: EditDetailFactureComponent;
  let fixture: ComponentFixture<EditDetailFactureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditDetailFactureComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditDetailFactureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
