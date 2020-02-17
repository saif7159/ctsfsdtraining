import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TwowaytestComponent } from './twowaytest.component';

describe('TwowaytestComponent', () => {
  let component: TwowaytestComponent;
  let fixture: ComponentFixture<TwowaytestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TwowaytestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TwowaytestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
