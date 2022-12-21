import { Component, OnInit } from '@angular/core';
import { Router, RouterLinkActive } from '@angular/router';
import { user } from '../Model/user';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit{
  user:user =new user();
  ngOnInit():void{}

  constructor(private userservice:UserServiceService,private router:Router)//,active:RouterLinkActive){
{
  }
  userSignUp()
  {  
     this.userservice.insertUser(this.user).subscribe(data=>{
      alert("sign successfully")
     });
     this.router.navigateByUrl("");
  }


}
