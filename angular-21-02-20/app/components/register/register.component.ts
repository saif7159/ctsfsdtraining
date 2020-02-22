import { Component, OnInit } from '@angular/core';
import { UserData } from 'src/app/model/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }
  userdata:UserData = new UserData("saif.24feb@gmail.com","fkhadk123",0,"Beverages","Male",true);
  interests = ["Beverages", "Dairy", "Bakery", "Vegetables"];
  ngOnInit(): void {
  }
getUserData()
{
  console.log(this.userdata);
}
}
