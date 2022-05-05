import { Component, OnInit } from '@angular/core';


import jsonData from './dummyData.json';
//import data from './dummyData'


@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = []

  constructor() { 
      //this.employees = data
      this.employees = jsonData
  }

  ngOnInit(): void {
  }

  public saveEmployee(empid:any,empname:string,department:string,salary:any):void
  {
      var obj = { empid : empid*1,
                  empname  :empname ,
                  department : department ,
                  salary : salary*1}
      //console.log(obj)
      this.employees.push(obj)
  }

}
