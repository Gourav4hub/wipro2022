import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { ProfileComponent } from './profile/profile.component';
import { WorkComponent } from './work/work.component';

const routes: Routes = [
  { path : "" , component : AboutComponent},
  { path : "profile" , component : ProfileComponent},
  { path : "work" , component : WorkComponent},
  { path : "contact" , component : ContactComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
