import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { productService } from '../Services/product.service';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit{
  constructor(private productservice:productService,private router:Router,
    private activatedRoute:ActivatedRoute){}
  ngOnInit(): void {
    let pid:number;
    this.activatedRoute.params.subscribe((param:Params)=>{
      pid=+param['pid'];}
    );
    this.productservice.deleteProduct(pid).subscribe((re:string)=>{
      console.log(re);
 
  });
  this.router.navigateByUrl('../admin-portal');
}
}
