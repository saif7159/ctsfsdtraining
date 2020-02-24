import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../model/IEmployee';


@Injectable({
  providedIn: 'root'
})
export class DataserviceService {
  private baseUrl = "http://localhost:3636/api/v1/employee";
  constructor(private http: HttpClient) { }
  getEmployee():Observable<Employee>{
    return this.http.get<Employee>(this.baseUrl);
  }
}
