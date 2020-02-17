import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';

@Component({
  selector: 'app-employeecopy',
  templateUrl: './employeecopy.component.html',
  styleUrls: ['./employeecopy.component.css']
})
export class EmployeecopyComponent implements OnInit {

  employees = [];
  constructor(private dataService:DataService) { }

  ngOnInit(): void {
    this.employees = this.dataService.getEmployees();
  }
}
