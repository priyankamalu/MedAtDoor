import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminPortalComponent } from './admin-portal/admin-portal.component';
import { AdminComponent } from './admin/admin.component';
import { DeleteComponent } from './delete/delete.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { InsertComponent } from './insert/insert.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UserPortalComponent } from './user-portal/user-portal.component';
import { UpdateComponent } from './update/update.component';
import { CartComponent } from './cart/cart.component';
import { PaymentComponent } from './payment/payment.component';


const routes: Routes = [
  {path:'',component: HomeComponent},
  {path:'admin',component:AdminComponent},
  {path:'pament',component:PaymentComponent},
  {path:'insert',component:InsertComponent},
  
  {path:'cart/:uid',component:CartComponent},
  {path:'login',component:LoginComponent},
  {path:'signup',component:SignUpComponent},
  {path:'admin-portal',component:AdminPortalComponent},
  {path:'user-portal/:uid',component:UserPortalComponent},
  {path:'',redirectTo:'/Home',pathMatch:'full'},
  {path:'delete/:pid',component:DeleteComponent},
  {path:'update',component:UpdateComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
