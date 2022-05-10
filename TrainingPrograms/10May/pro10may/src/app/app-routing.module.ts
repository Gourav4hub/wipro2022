import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DemoComponent } from './demo/demo.component';
import { EmployeeComponent } from './employee/employee.component';
import { TestComponent } from './test/test.component';

const routes: Routes = [
  { path: "employee" , component : EmployeeComponent},
  { path: 'test' , component: TestComponent},
  { path: 'demo' , component : DemoComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
