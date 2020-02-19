import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartitemsComponent } from './components/cartitems/cartitems.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { ProductsComponent } from './components/products/products.component';

const routes: Routes = [
    {path: '', component: HomeComponent},
    {path: 'cart',component: CartitemsComponent},
    {path: 'login',component: LoginComponent},
    {path: 'products/:id',component: ProductsComponent}
    
]
@NgModule({
    imports: [ RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{

}