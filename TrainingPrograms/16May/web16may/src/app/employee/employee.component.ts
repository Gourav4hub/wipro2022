import { Component, OnInit } from '@angular/core';

import { FormGroup , FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = [
    {empid:101 , empname:"Vikas Gupta" , gender:'male', city:"Pune" , salary:45600},
    {empid:102 , empname:"Meena Sharma" , gender:'female' , city:"Indore" , salary:34500},
    {empid:103 , empname:"Prakesh Verma" , gender:'male' ,city:"Dewas" , salary:29000}
  ]

  public empFrmGroup:FormGroup;

  constructor() {
    this.empFrmGroup = new FormGroup({
        empid : new FormControl(null,Validators.required),
        empname : new FormControl(null,Validators.required),
        city : new FormControl(null),
        salary : new FormControl(null),
        gender : new FormControl('male')
    })
  }

  ngOnInit(): void {
  }

  public add():void
  {
    var emp:any = this.empFrmGroup.value
    console.log(emp)
    this.employees.push(emp)
  }

  public delete(empid:any):void{
    this.employees = this.employees.filter((ob:any)=>ob.empid!=empid)
  }
}
