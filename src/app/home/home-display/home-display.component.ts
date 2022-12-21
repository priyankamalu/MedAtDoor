import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { product } from 'src/app/Model/product.model';
import { productService } from 'src/app/Services/product.service';

@Component({
  selector: 'app-home-display',
  templateUrl: './home-display.component.html',
  styleUrls: ['./home-display.component.css']
})
export class HomeDisplayComponent implements OnInit {

  value:string;
  name1:Boolean;
   p:product[];
  constructor(private router:Router,private productservice:productService){}
  ngOnInit():void{
    this.productservice.getProducts().subscribe((product:product[])=>{
      this.p=product;
    });
  }

  onClick11(value:string)
  {  this.value=value;
    
   //this.productservice= 
   this.productservice.findByPname(this.value).subscribe((p:product[])=>{
      this.p=p;
    });
    this.router.navigateByUrl("Home");
  }

}
