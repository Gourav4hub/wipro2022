import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export default class CategoryService 
{
  public categories:any = []

  constructor(private http:HttpClient){
    this.loadCategories()
  }

  private loadCategories():void
  {
    console.log("Loading Categories ......")
    this.http.get("https://ecommerce-web-sample.herokuapp.com/api/category/list").subscribe((data:any)=>{
        this.categories = data
    });
  }

  public saveCategory(data:any)
  {
    return this.http.post("https://ecommerce-web-sample.herokuapp.com/api/category/save",data);
  }
}
