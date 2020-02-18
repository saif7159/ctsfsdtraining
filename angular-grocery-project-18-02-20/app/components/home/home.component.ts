import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data-service.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  categories: any;
  subcategories: any;
  products: any;
  constructor(private dataService:DataServiceService) { }
  
  ngOnInit(): void {
    this.dataService.getCategories().subscribe(d => this.categories =d.data);
    this.dataService.getSubCategories().subscribe(e => this.subcategories =e.data);
    this.dataService.getProducts().subscribe(p => this.products =p.data);

  }


}
