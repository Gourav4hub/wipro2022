import { Component, OnInit } from '@angular/core';

import CategoryService from '../services/category.service';

@Component({
  selector: 'app-category',
  templateUrl: './category.component.html',
  styleUrls: ['./category.component.css']
})
export class CategoryComponent implements OnInit 
{
  public msg:string = "";

  constructor(public categoryService:CategoryService) {}

  ngOnInit(): void {
  }

  public save(data:any){
    // console.log(data)
    this.msg = "Category Saving ....... "
    this.categoryService.saveCategory(data).subscribe((response:any)=>
    {
      if(response.status)
      {
        this.msg = "Category Saved ....... "
        this.categoryService.categories.push(response.category)
      }
      else
        this.msg = "Category Not Saved ....... "
    });
  }

}
