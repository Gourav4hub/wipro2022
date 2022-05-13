import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {
  public msg:string = ""
  constructor(private userSerice:UserService) { }


  ngOnInit(): void {
  }

  public login(data:any){
    console.log(data)
    this.userSerice.login(data).subscribe((response:any)=>{
        if(response.status)
        {
          this.msg = response.msg + " : " + response.token
          this.userSerice.islogin = true
          this.userSerice.token = response.token
        }
        else
          this.msg = response.msg  
    })
  }
}
