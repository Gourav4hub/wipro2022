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

}
