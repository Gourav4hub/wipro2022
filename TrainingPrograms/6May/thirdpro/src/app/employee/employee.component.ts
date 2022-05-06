import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit 
{
  public employees:any = []

  public editInfo:any = {
    isupdate : false,
    employee : { empid : '' , empname : "",
      department : "", salary : '' 
    }
  }

  public deleteInfo:any = {
      isdelete : false,
      employee : undefined
  }

  public deleteItems:any = []

  public duplicateEmpIdStatus:boolean = false;
  public addButtonDisableStatus:boolean = false;
  public deleteAllCheckStatus:boolean = false;
 

  constructor() 
  {       
    var data = localStorage.getItem('employees')
    if(data==undefined)
      this.employees = []
    else  
      this.employees = JSON.parse(data)
  }

  ngOnInit(): void {
  }

  public saveData():void
  {
    localStorage.setItem("employees", JSON.stringify(this.employees));
    alert("Data Saved !");
  }

  public changeAllStatus(event:any):void
  {
    var status = event.target.checked
    this.deleteAllCheckStatus = status
    if(status){
      this.deleteItems = this.employees.map((ob:any)=>ob.empid)
    }else{
      this.deleteItems = []
    }
  }

  public deleteAll():void
  {
    //console.log(this.deleteItems)
    var answer = confirm("Are You Sure To Delete ?")
    if(answer){
      this.employees = this.employees.filter((ob:any)=>{
          return this.deleteItems.indexOf(ob.empid)<0
      })
      this.deleteItems = []
      this.deleteAllCheckStatus = false

    }
  }
  public deleteEmpCheck(event:any,empid:any):void
  {
    var status = event.target.checked
    //console.log("Hi..... ",status,empid)
    if(status)
    {
      // add empid in array
      this.deleteItems.push(empid);
    }else
    {
      // remove empid in array
      this.deleteItems = this.deleteItems.filter((id:any)=>id!=empid)
    }
  }

  public checkEmpId(event:any):void
  {
    if(this.editInfo.isupdate==false)
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
  }
  public changeStatus():void
  {
      this.duplicateEmpIdStatus = false
      this.addButtonDisableStatus = false
  }

  public editEmployee(emp:any)
  {
    this.editInfo = {
      isupdate : true,
      employee : emp
    }
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

  public cancelUpdate():void{
    this.editInfo = {
      isupdate : false,
      employee : { empid : '' , empname : "",
          department : "", salary : '' 
      }
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

  public update(empid:any,empname:string,department:string,salary:any):void
  {
      var obj = { empid : empid*1,
                  empname  :empname ,
                  department : department ,
                  salary : salary*1}
      
      this.employees = this.employees.map((ob:any)=>ob.empid==empid?obj:ob)
      this.cancelUpdate()
  }

}
