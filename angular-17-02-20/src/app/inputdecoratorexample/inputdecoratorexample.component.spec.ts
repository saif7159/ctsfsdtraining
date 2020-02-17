import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InputdecoratorexampleComponent } from './inputdecoratorexample.component';

describe('InputdecoratorexampleComponent', () => {
  let component: InputdecoratorexampleComponent;
  let fixture: ComponentFixture<InputdecoratorexampleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InputdecoratorexampleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InputdecoratorexampleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
