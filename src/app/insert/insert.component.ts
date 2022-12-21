import { Component,OnInit } from '@angular/core';
import { product } from '../Model/product.model';
import { productService } from '../Services/product.service';
import { ActivatedRoute, Params, Router } from '@angular/router';


@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit{
  pro:product=new product();
  constructor(private productservice:productService,private rouer:Router){}
  
  ngOnInit():void{}
  onSubmit(){
    this.productservice.insertProduct(this.pro).subscribe(data=>{
      alert("data saved successfully");
    })
    this.rouer.navigateByUrl("admin-portal")
  }

}
