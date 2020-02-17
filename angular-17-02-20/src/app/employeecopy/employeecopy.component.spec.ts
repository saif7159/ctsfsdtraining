import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeecopyComponent } from './employeecopy.component';

describe('EmployeecopyComponent', () => {
  let component: EmployeecopyComponent;
  let fixture: ComponentFixture<EmployeecopyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeecopyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeecopyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
