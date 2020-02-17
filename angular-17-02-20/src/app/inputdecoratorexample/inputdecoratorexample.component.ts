import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-inputdecoratorexample',
  templateUrl: './inputdecoratorexample.component.html',
  styleUrls: ['./inputdecoratorexample.component.css']
})
export class InputdecoratorexampleComponent implements OnInit {

  constructor() { }
  @Input()
  demotext;
  @Input()
  first;
  @Input()
  last;
  @Input()
  model;
  @Output()
  childEvent = new EventEmitter();
  date = new Date();
  sendToParent(){
    this.childEvent.emit("Data from child to parent");
  };
  ngOnInit(): void {
  }

}
