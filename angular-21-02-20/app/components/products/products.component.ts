import { Component, OnInit } from '@angular/core';
import { DataServiceService } from 'src/app/services/data-service.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
  catId:string;
  constructor(private dataService:DataServiceService, private route: ActivatedRoute) {
    this.catId = this.route.snapshot.paramMap.get("id");
   }
  subcategories: any;
  products: any;
  
  
  ngOnInit(): void {
    this.dataService.getSubCategories(this.catId).subscribe(e => this.subcategories =e.data);
    this.dataService.getProducts(this.catId).subscribe(p => this.products =p.data);
    
  }
  addToCart(item){
    if(localStorage.cart == "undefined")
    {
      var cartitems = [];
      cartitems.push(item);
      localStorage.setItem("cart",JSON.stringify(cartitems));

    }
    else{
      var p = JSON.parse(localStorage.cart);
      p.push(item);
      localStorage.cart = JSON.stringify(p);
    }

  }
  selectSubCat(val)
  {
    console.log(val)
    this.dataService.getProducts(val).subscribe(p => this.products =p.data);
  }
}
