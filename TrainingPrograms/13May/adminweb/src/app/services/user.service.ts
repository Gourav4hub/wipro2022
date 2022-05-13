import { Injectable } from '@angular/core';

import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService 
{
  public islogin:boolean = false
  public token:string = ""
  constructor(private http:HttpClient) { }

  public register(data:any)
  {
    return this.http.post("https://ecommerce-web-sample.herokuapp.com/user/register",data)
  }

  public login(data:any)
  {
    return this.http.post("https://ecommerce-web-sample.herokuapp.com/user/login",data)
  }

  public getUser()
  {
    var token = this.token;
    console.log(">>> ",token)
    const auth = new HttpHeaders({
      'Content-Type' : 'application/json',
      'Authorization' : "Bearer " + token
    })
    return this.http.post("https://ecommerce-web-sample.herokuapp.com/user/getUser",{},{headers : auth})
  }
}
