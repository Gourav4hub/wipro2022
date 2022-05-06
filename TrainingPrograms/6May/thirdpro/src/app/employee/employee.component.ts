import { Component, OnInit } from '@angular/core';
import jsonData from './dummyData.json';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = []

  public deleteInfo:any = {
      isdelete : false,
      employee : undefined
  }

  public duplicateEmpIdStatus:boolean = false;
  public addButtonDisableStatus:boolean = false;

  constructor() {       
      this.employees = jsonData
  }

  ngOnInit(): void {
  }

  public checkEmpId(event:any):void
  {
    var id = event.target.value;
    //console.log(id)
    var empObj = this.employees.find((ob:any)=>ob.empid==id)
    //console.log(empObj)
    if(empObj!=undefined)
    {
      this.duplicateEmpIdStatus = true
      this.addButtonDisableStatus = true
    }
  }
  public changeStatus():void
  {
      this.duplicateEmpIdStatus = false
      this.addButtonDisableStatus = false
  }

  public deleteEmployee(emp:any)
  {
    this.deleteInfo = {
      isdelete : true,
      employee : emp
    }
  }
  public cancelDelete():void{
    this.deleteInfo = {
      isdelete : false,
      employee : undefined
    }
  }
  public delete():void
  {
     this.employees = this.employees.filter((ob:any)=>ob.empid!=this.deleteInfo.employee.empid)
     this.cancelDelete()
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
