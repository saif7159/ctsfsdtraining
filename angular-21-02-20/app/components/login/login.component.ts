import { Component, OnInit } from '@angular/core';
import { FormBuilder,FormGroup, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  // public userGroup : FormGroup = new FormGroup(
  //   {
  //     email: new FormControl(''),
  //     password: new FormControl(''),
  //     addressGroup: new FormGroup({
  //       home: new FormControl(''),
  //       city: new FormControl(''),
  //       country: new FormControl('')
  //     })
  //   }
  // );
  userGroup;
  loadData(){
    this.userGroup.setValue(
      {
        email: "asda",
        password: "dasd",
        addressGroup: {
          home: "dasf",
          city: "ask",
          country: "hdkskjr"
        }
      }
    )
  }
   constructor( private formBuilder : FormBuilder) { }

   ngOnInit(): void {
    this.createForm();
   // this.loadData();
   }
   createForm(){
     this.userGroup = this.formBuilder.group({
      email: [null, Validators.required],
      password: [null, [Validators.required, Validators.minLength(6)]],
      addressGroup : this.formBuilder.group ({
        home: [null],
        city: [null],
        country: [null]
      })
     });
   }
   getLoginCred(val){
    console.log(val);
  }
}
