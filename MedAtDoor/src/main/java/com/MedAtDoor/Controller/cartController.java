package com.MedAtDoor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.MedAtDoor.Entity.cartEntity;
import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Entity.userEntity;
import com.MedAtDoor.Service.cartService;
import com.MedAtDoor.Service.productService;
import com.MedAtDoor.Service.userService;

@RestController
@CrossOrigin("http://localhost:4200")
public class cartController {
	@Autowired
	private cartService cartservice;
	@Autowired
	private userService userservice;
	@Autowired
	private productService productservice; 
	
	@GetMapping("/{pid}/{uid}")
	public ResponseEntity<cartEntity> addToCart(@PathVariable int pid,@PathVariable int uid)
	{   productEntity product=productservice.getProduct(pid);
	    userEntity user=userservice.findByUid(uid);
	    cartEntity cart = new cartEntity(user, product);
	    cart.setUnit(1);
		cartEntity cart1=cartservice.addToCart(cart);
		return new ResponseEntity<cartEntity>(cart1,HttpStatus.CREATED);
	}
	@GetMapping("/GG/{uid}")
	public List<cartEntity> getAllByuserid(@PathVariable("uid")int uid) {
		System.out.println(uid);
		return cartservice.findAllByUidCart(uid);
	}

	@DeleteMapping("/{cid}")
	public ResponseEntity<?> deletCart(@PathVariable int cid) {

		cartservice.deleteCart(cid);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
