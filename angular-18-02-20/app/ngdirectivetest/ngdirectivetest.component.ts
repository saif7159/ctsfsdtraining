import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-ngdirectivetest",
  templateUrl: "./ngdirectivetest.component.html",
  styleUrls: ["./ngdirectivetest.component.css"]
})
export class NgdirectivetestComponent implements OnInit {
  Employees = [];
  constructor() {
    this.Employees = [
      { eId: 1, Name: "Saif", Email: "saif.24feb@gmail.com" },
      { eId: 2, Name: "Manu", Email: "cuy.fs@gmail.com" },
      { eId: 3, Name: "Vkarma", Email: "hta.lf@gmail.com" }
    ];
  }
  onButtonClick() {
    this.Employees = [
      { eId: 1, Name: "Saif", Email: "saif.24feb@gmail.com" },
      { eId: 2, Name: "Manu", Email: "cuy.fs@gmail.com" },
      { eId: 3, Name: "Vkarma", Email: "hta.lf@gmail.com" },
      { eId: 4, Name: "xyz", Email: "xyz.lf@gmail.com" }
    ];
  }
  trackByEmpId(Employees, index) {
    return Employees.eId;
  }

  ngOnInit(): void {}
  hasError = false;
  isLogged() {
    return false;
  }
  day = 6;
  wday: String = "Friday";
  arr = ["one", "two", "three", "four", "five"];
  //Complex Array
  /*Employees = [{eId:1,Name:"Saif",Email:"saif.24feb@gmail.com"},
  {eId:2,Name:"Manu",Email:"cuy.fs@gmail.com"},
  {eId:3,Name:"Vkarma",Email:"hta.lf@gmail.com"}]*/
}
