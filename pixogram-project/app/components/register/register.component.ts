import { Component, OnInit } from '@angular/core';
import { Register } from 'src/app/models/register.model';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  

  u=new Register('','','','','','','')

  ngOnInit(): void {
  }

  registerForm: FormGroup;
  fname:String=""
  lname:String=""
  username: string=""
  dob: string=""
  email: string=""
  password:string=""
  profilepic:string=""
 

  constructor(private fb: FormBuilder) {
    this.registerForm = fb.group({
      'fname': ['', [Validators.required, Validators.minLength(3)]],
      'lname': ['', [Validators.required, Validators.minLength(3)]],
      'username': ['', [Validators.required, Validators.minLength(3)]],
      'dob': ['', [Validators.required, Validators.minLength(3)]],
      'email': ['', [Validators.required, Validators.minLength(3)]],
      'password': ['', [Validators.required, Validators.minLength(8),Validators.maxLength(12)]],
      'confirmpassword':['', [Validators.required, Validators.minLength(8),Validators.maxLength(12)]]      

    },
    { 
      validators: this.password1.bind(this)
    }
    );
  }

  onRegister(data) {
    console.log(data +"registered")
  }

  upload() {
    console.log("registered")
  }
  password1(registerForm: FormGroup) {
    const { value: password } = registerForm.get('password');
    const { value: confirmPassword } = registerForm.get('confirmpassword');
    return password === confirmPassword ? null : { passwordNotMatch: true };
  }

}
