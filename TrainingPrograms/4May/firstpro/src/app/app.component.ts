import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent 
{
  public title:string = "Wipro Full Stack Training !"
  public num:number = 100;
  public student:any = {
    roll : 101,
    name : 'vikas',
    marks : 345.45
  }

  public handleChangeTitle():void
  {
    this.title = "My Name is Gourav Kumar !"
  }

  public handleChangeNum():void
  {
    this.num += 10;
  }
}
