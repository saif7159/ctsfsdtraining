import { Component, OnInit } from '@angular/core';
import { DataserviceService } from 'src/app/service/dataservice.service';
import { Employee } from 'src/app/model/IEmployee';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  constructor(private dataService:DataserviceService) { }
  employees:Employee;
  ngOnInit(): void {
    this.dataService.getEmployee().subscribe(emp => this.employees = emp.data);
    console.log(this.employees);
  }

}
