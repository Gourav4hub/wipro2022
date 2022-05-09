import { Component } from '@angular/core';
import dummyData from './dummyTask';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  public tasks:any = dummyData
  public statusList:string[] = ['active','deactive','complete','delete']

  public addTask(title:any):void
  {
     var task = {
       title : title,
       assignDate : new Date().toLocaleDateString(),
       completeDate : undefined,
       deleteDate  : undefined,
       status : 'active'
     }
     this.tasks.push(task)
  }
}
