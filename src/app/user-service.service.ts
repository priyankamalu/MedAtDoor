import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { user } from './Model/user';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {
  f:Boolean;
  private url:string="http://localhost:8080/med";

  constructor(private httpClient:HttpClient){

  }

  insertUser(user:user):Observable<object>{
    return this.httpClient.post(`${this.url}`,user);
  }
 validateUser(user:user):Observable<object>{
    return this.httpClient.get("http://localhost:8080/med/'+user'");
 }
 getusers(){
  return this.httpClient.get<user[]>("http://localhost:8080/med");
 }
}
