import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService 
{
  constructor(private http:HttpClient) { }

  public register(data:any)
  {
    return this.http.post("https://ecommerce-web-sample.herokuapp.com/user/register",data)
  }
}
