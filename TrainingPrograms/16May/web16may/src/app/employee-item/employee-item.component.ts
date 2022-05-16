import { Component, OnInit, Input , Output, EventEmitter} from '@angular/core';


@Component({
  selector: 'app-employee-item',
  templateUrl: './employee-item.component.html',
  styleUrls: ['./employee-item.component.css']
})
export class EmployeeItemComponent implements OnInit 
{
  @Input("emp") emp:any;
  @Input("index") index:number = 0;

  @Output("deleteItem") deleteItem = new EventEmitter();
  
  constructor() { }

  ngOnInit(): void {
   
  }

  public deleteEmp():void{
    this.deleteItem.emit(this.emp.empid)
  }

}
