import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-first-project';
  firstname = "Mark";
  lastname = "Smith";
  ac = {firstn:"Saif",lastn:"Haque", email:"saif.24feb@gmail.com"};
  message = "";
  
  
  // getMessage(value)
  // {
  //   console.log(value);
  // }
  
}
