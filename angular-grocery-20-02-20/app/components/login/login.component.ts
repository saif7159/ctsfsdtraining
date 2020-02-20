import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup,Validator, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public userGroup : FormGroup
  constructor( private formBuilder : FormBuilder) { }

  ngOnInit(): void {
    this.createForm();
  }
  createForm(){
    this.userGroup = this.formBuilder.group({
      email: [null, Validators.required],
      password: [null, Validators.required]
    });
  }
  getLoginCred(val){
    console.log(val);
  }
}
