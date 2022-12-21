import { Component,OnInit } from '@angular/core';
import { product } from '../Model/product.model';
import { productService } from '../Services/product.service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  pro:product={
    pid:0,
    pname:'',
    catagory:'',
    quantity:0,
    price:0
  }
 
  constructor(private productservice:productService,private rouer:Router){}
  
  ngOnInit():void{ //let pid:number;
   // this.activatedRoute.params.subscribe((param:Params)=>{
     // this.pro=+param['product'];
    //s});}
  }

  editProduct(data:product){
   this.pro=data;
  this.pro.pid=data.pid;
    this.productservice.updateProduct(this.pro).subscribe(data=>{
      alert("data saved successfully")
         })


    this.rouer.navigateByUrl("admin-portal")
  }


}
