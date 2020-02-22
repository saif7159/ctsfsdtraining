import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  categories: any;

  constructor(private dataService:DataServiceService, private router:Router) { }

  ngOnInit(): void {
    this.dataService.getCategories().subscribe(d => this.categories =d.data);

  }

  selectCategory(value)
  { console.log(value.catId)
    this.router.navigate(['/products',value.catId])
  }
 


}
