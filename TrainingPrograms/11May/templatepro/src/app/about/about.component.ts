import { Component, OnInit } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit 
{
  public users:any = []
  constructor(private http:HttpClient) {}

  ngOnInit(): void {
  }

  public load():void
  {
    var ob:Observable<any> = this.http.get("https://jsonplaceholder.typicode.com/users")

    ob.subscribe((data:any)=>{
        this.users = data
    })

  }
}
