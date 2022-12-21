import { Component,OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { CartService } from '../cart.service';
import { product } from '../Model/product.model';
import { productService } from '../Services/product.service';

@Component({
  selector: 'app-user-portal',
  templateUrl: './user-portal.component.html',
  styleUrls: ['./user-portal.component.css']
})
export class UserPortalComponent  implements OnInit {

  pp:product[];
  p:product=new product();
  

  constructor(private cartservice:CartService,private router:Router,
    private productservice:productService, private activatedRoute:ActivatedRoute){}
  //uid:any;
  pid:any;
 uid:number;
 u:number;
  ngOnInit():void{
    
    this.activatedRoute.params.subscribe((param:Params)=>{
      this.uid=+param['uid'];}
    );
   // this.uid=this.router.paramMap.get('id')
    
    this.productservice.getProducts().subscribe((product:product[])=>{
    this.pp=product;
  });
   
}
onClick(){
  this.router.navigate(['cart',this.uid])
}

  onClick1(pid:number)

   {   // console.log(pid);
        this.pid=pid
      this.cartservice.addToCart(this.pid,this.uid).subscribe(res=>{
        alert("item added to cart")
      });
     //  this.router.navigateByUrl('cart');
   }   
  } 


