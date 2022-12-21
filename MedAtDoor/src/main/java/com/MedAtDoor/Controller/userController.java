package com.MedAtDoor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Entity.userEntity;
import com.MedAtDoor.Service.userService;


@RestController
@RequestMapping("/med")
@CrossOrigin(origins="http://localhost:4200")
public class userController {
	
	@Autowired
	private userService userservice;
	
	
	
	@PostMapping
	public Boolean insertUser(@RequestBody userEntity u){
		userservice.insertUser(u);
		String pass="admin@123";
		String name="admin";
		Boolean value=false;
		int no=u.getUid();
		userEntity user= userservice.findByUid(no); 
		System.out.println(user.getUname()+"bcbdbjbd");
		if(user.getUpassword().equals(pass) && user.getUname().equals(name) )
		{
			value=true;
	      }
		System.out.println("howa");
		return value;//new ResponseEntity<String>("insertion done",HttpStatus.CREATED);
		
	}


	@GetMapping
	public ResponseEntity<Iterable<userEntity>> getUsers()
	{
		Iterable<userEntity> rece=userservice.getusers();
		return new ResponseEntity<Iterable<userEntity>>(rece,HttpStatus.OK);

	}
	
	
	

}
