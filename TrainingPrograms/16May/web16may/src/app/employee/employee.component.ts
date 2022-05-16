import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = [
    {empid:101 , empname:"Vikas Gupta" , city:"Pune" , salary:45600},
    {empid:102 , empname:"Meena Sharma" , city:"Indore" , salary:34500},
    {empid:103 , empname:"Prakesh Verma" , city:"Dewas" , salary:29000}
  ]
  constructor() { }

  ngOnInit(): void {
  }

  public add(emp:any):void
  {
    this.employees.push(emp)
  }

  public delete(empid:any):void{
    this.employees = this.employees.filter((ob:any)=>ob.empid!=empid)
  }
}
