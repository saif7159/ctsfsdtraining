import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { NgdirectivetestComponent } from './ngdirectivetest/ngdirectivetest.component';
import { TwowaytestComponent } from './twowaytest/twowaytest.component';
import { FormsModule } from '@angular/forms';
import { InputdecoratorexampleComponent } from './inputdecoratorexample/inputdecoratorexample.component';
import { EmployeeComponent } from './employee/employee.component'
import { TitlePipe } from './title.pipe';
import { EmployeecopyComponent } from './employeecopy/employeecopy.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    SidebarComponent,
    NgdirectivetestComponent,
    TwowaytestComponent,
    InputdecoratorexampleComponent,
    EmployeeComponent,
    TitlePipe,
    EmployeecopyComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
    
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
