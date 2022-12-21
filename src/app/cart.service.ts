import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  constructor(private http:HttpClient) { }
  baseUrl:string="http://localhost:8080"
  getAllByuserid(uid:any){
    return this.http.get<any>(this.baseUrl+'/GG'+"/"+uid);

  }
  addToCart(pid:any,uid:any){
    return this.http.get(this.baseUrl+"/"+pid+"/"+uid);
  }
 
  deleteCart(cid:any){
    return this.http.delete<any>(this.baseUrl+cid)
  }


}