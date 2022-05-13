import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CategoryComponent } from './category/category.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { UserloginComponent } from './userlogin/userlogin.component';

const routes: Routes = [
  { path : "" , component : LoginComponent},
  { path : "category" , component : CategoryComponent},
  { path : "register" , component : RegisterComponent},
  { path : "userlogin" , component : UserloginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
