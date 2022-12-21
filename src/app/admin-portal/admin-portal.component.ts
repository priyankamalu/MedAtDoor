import { Component, OnInit } from '@angular/core';
import { product } from '../Model/product.model';
import { productService } from '../Services/product.service';
import { ActivatedRoute, Params, Router } from '@angular/router';


@Component({
  selector: 'app-admin-portal',
  templateUrl: './admin-portal.component.html',
  styleUrls: ['./admin-portal.component.css']
})

export class AdminPortalComponent implements OnInit {
  p:product[];

  constructor(private productservice:productService,private router:Router){}

  ngOnInit():void{
    this.productservice.getProducts().subscribe((product:product[])=>{
      this.p=product;
    });

  }


   onClick(){
      this.router.navigateByUrl('insert');
    
  }
  
 /* onClick1(pro){
    this.router.navigateByUrl('update');
  
}*/

}



