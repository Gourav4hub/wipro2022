import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = []

  constructor() { 
    this.employees.push({
      empid : 101,empname : 'Vikas Parmar',
      department : 'Sales', salary : 35000 
    })
    this.employees.push({
      empid : 102,empname : 'Meena Verma',
      department : 'Purchase', salary : 28000 
    })
    this.employees.push({
      empid : 103,empname : 'Gopal Das',
      department : 'Store', salary : 17000 
    })
    this.employees.push({
      empid : 104,empname : 'Prakash Gupta',
      department : 'Purchase', salary : 21000 
    })
  }

  ngOnInit(): void {
  }

}
