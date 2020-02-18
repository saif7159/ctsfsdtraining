import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-twowaytest',
  templateUrl: './twowaytest.component.html',
  styleUrls: ['./twowaytest.component.css']
})
export class TwowaytestComponent implements OnInit {

  constructor() { }
  twoway = "Two Way";
  ngOnInit(): void {
  }
  onButtonClick(value){
    console.log(value);
  }
}
