import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cartitems',
  templateUrl: './cartitems.component.html',
  styleUrls: ['./cartitems.component.css']
})
export class CartitemsComponent implements OnInit {

  constructor() { }
  cartItems;
  ngOnInit(): void {
  if(localStorage.cart != "undefined")
  {
    this.cartItems = (JSON.parse(localStorage.cart));
    console.log(this.cartItems);
  }
  }
  deleteFromCart(item)
  {
   localStorage.removeItem(item);
  }

}
