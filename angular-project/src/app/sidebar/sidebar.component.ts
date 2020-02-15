import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-sidebar',
  templateUrl: './sidebar.component.html',
  styleUrls: ['./sidebar.component.css']
})
export class SidebarComponent implements OnInit {

  constructor() { }
  name = "Saif";
  isDisabled=false;
  cssStyle: string = 'text-info';
  hasError=false;
  special = {
    color: 'Red',
    fontStyle : 'Italic'
  }
  ngOnInit(): void {
  }
  getMessage():String{
    return "This is data binding test."
  }
  onClick(){
    console.log("Button Clicked");
  }
  getDemoCss(){
    return 'myTestClass';
  }
}
