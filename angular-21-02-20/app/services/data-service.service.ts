import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, ObservableLike } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataServiceService {
  private baseurl = "http://apolis-grocery.herokuapp.com/api/";
  private categoryurl = "category"
  private sub = "subcategory/";
  private products = "products/";
  constructor(private http:HttpClient) { }
  public getCategories():Observable<any>{
    return this.http.get<any>(this.baseurl+this.categoryurl);
  }
  public getSubCategories(val):Observable<any>{
    return this.http.get<any>(this.baseurl+this.sub+val);
  }
  public getProducts(val):Observable<any>{
    return this.http.get<any>(this.baseurl+this.products+val);
  }
}
