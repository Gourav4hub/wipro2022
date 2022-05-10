import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent
{
   public cities:any = ['Pune','Delhi','Raipur','Mumbai','Indore']

  public saveEmployee(data:any):void
  {
    console.log(data)
  }
}
