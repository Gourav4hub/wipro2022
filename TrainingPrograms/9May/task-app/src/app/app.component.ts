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

  public changeStatus(task:any,status:string):void
  {
      task.status = status
      if(status=='complete'){
        task.completeDate = new Date().toLocaleDateString()
      }
      if(status=='delete'){
        task.deleteDate = new Date().toLocaleDateString()
      }

      var index = this.tasks.indexOf(task)
      this.tasks[index] = task
  }

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
