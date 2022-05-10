import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit 
{

  public cities:any = ['Pune','Delhi','Raipur','Mumbai','Indore']

 
  constructor() { }

  ngOnInit(): void {
  }

}
