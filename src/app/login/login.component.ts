import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { user } from '../Model/user';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  flag:Boolean=false;
 // user:user=new user();
  user:user={
    uid:0,
    uname:'',
    upassword:'',
    address:'',
    contact_no:''
  }

  constructor(private userservice:UserServiceService,private router:Router)//,active:RouterLinkActive){
{
  }
  
ngOnInit():void{

}
loginAdmin(){
  /*
  this.userservice.validateUser(this.user).subscribe((data:Boolean)=>{
     this.flag=data;
    console.log(this.flag)
  });
    if(this.flag===true)
    {
      this.router.navigateByUrl("admin-portal");
    }
    else
    {
      this.router.navigateByUrl("user-portal");
    }
*/
this.userservice.getusers().subscribe( userList =>  {

       userList.forEach(data => { 
       
     console.log("uname "+this.user.uname+" password"+this.user.upassword)
     if(this.user.uname == "admin" && this.user.upassword == "admin@123")
     {
      
      this.router.navigate(['admin-portal']);
     }

  if(data.uname == this.user.uname && data.upassword == this.user.upassword){
      alert("Login Successful!")
    //  localStorage.setItem('token',"hgdgfjbvjh-dnjdbvjh-klkioubhawgf-uidhrbvsejuhdvjbj-jfdhh")
        this.router.navigate(['user-portal',data.uid]);
       // this.router.navigateByUrl('/user')
     }
     else{
      console.log("Invalid Credentials, Enter valid data")
    }
  });
});  

}
//this.userservice.getusers().subscribe()
} 