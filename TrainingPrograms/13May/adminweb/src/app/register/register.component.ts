import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit 
{
  public msg:string = ""
  constructor(private userService:UserService) { }

  ngOnInit(): void {
  }

  public save(data:any)
  {
    console.log(data)
    this.userService.register(data).subscribe((response:any)=>{
      if(response.status)
       this.msg = "Registeration Done !"
      else
        this.msg = "Registeration Failed !" 
    })
  }

}
