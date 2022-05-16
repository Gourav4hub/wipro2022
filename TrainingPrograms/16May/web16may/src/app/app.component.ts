import { Component } from '@angular/core';
import { FormGroup , FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent 
{
  public userFrmGroup:FormGroup;
  constructor(){
    this.userFrmGroup = new FormGroup({
        basicInfo : new FormGroup({
          userName : new FormControl(null,Validators.required),
          userEmail : new FormControl(null,[Validators.required,Validators.email]),
          userPhone : new FormControl(null,Validators.required),
          userPassword : new FormControl(null,Validators.required)
        }),
        otherInfo : new FormGroup({
          userDOB : new FormControl()
        })       
    })   
  }

  public register():void{
    console.log(this.userFrmGroup.value)
  }
}
