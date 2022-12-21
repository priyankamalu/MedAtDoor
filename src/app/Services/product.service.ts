import { Injectable} from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { product } from "../Model/product.model";

@Injectable({
    providedIn:'root'
})
export class productService
{

    //=new EventEmitter<rece[]>();
    private url:string="http://localhost:8080";
    private url1:string="http://localhost:8080/name";
constructor(private httpClient:HttpClient){

}
getProducts():Observable<product[]>{
  return this.httpClient.get<product[]>(this.url);
}
deleteProduct(pid:number):Observable<string>{
  return this.httpClient.delete<string>(this.url+`/${pid}`);
  console.log(pid);
}

insertProduct(product:product):Observable<String>{
   return this.httpClient.post<String>(this.url,product);
}
updateProduct(product:product){
  return this.httpClient.put("http://localhost:8080",product);
}
findByPname(pname):Observable<product[]>{
    return this.httpClient.get<product[]>(this.url);
  }
}