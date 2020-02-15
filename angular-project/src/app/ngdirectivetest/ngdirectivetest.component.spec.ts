import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NgdirectivetestComponent } from './ngdirectivetest.component';

describe('NgdirectivetestComponent', () => {
  let component: NgdirectivetestComponent;
  let fixture: ComponentFixture<NgdirectivetestComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NgdirectivetestComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NgdirectivetestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
