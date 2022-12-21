import { Component,EventEmitter,OnInit, Output } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { product } from '../Model/product.model';
import { productService } from '../Services/product.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  searchText:any;
  value:any;
  p:product[];
   name1:boolean=false;
   catagory:boolean=false;

  

  constructor( private activerouter:ActivatedRoute,private router:Router,
    private productservice:productService){}
  ngOnInit(): void {
    this.productservice.getProducts().subscribe((product:product[])=>{
      this.p=product;
    });
   
 
  }
  
  on(){
    alert("Please Login to Add Item to cart")
  }
 

}
