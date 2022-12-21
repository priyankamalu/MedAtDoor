import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { CartService } from '../cart.service';
import { user } from '../Model/user';
import { productService } from '../Services/product.service';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit{
  uid:any
  pid:any
  user:user={
    uid:0,
    uname:'',
    upassword:'',
    address:'',
    contact_no:''
}
grandTotal:any
product:any=[]
cart:any
constructor(private productservice:productService,private router:Router,
  private activatedRoute:ActivatedRoute,private cartservice:CartService,
  private userservice:UserServiceService){}
 
  ngOnInit(): void {
    let pid:number;
    this.activatedRoute.params.subscribe((param:Params)=>{
      pid=+param['pid'];}
    );

    let uid:number;
    this.activatedRoute.params.subscribe((param:Params)=>{
      uid=+param['uid'];}
    );
    
    this.cartservice.getAllByuserid(this.uid).subscribe(res=>{
      //this.cart=res
      console.log(res)
    });


   
  }

deleteCart(id:any){
  this.cartservice.deleteCart(id).subscribe(res=>{
    alert("item deleted ")

  })

}

}
