package com.MedAtDoor.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.MedAtDoor.Entity.productEntity;

import com.MedAtDoor.Service.productService;



@RestController
//@RequestMapping("/product")

@CrossOrigin(origins="http://localhost:4200")
public class productController {
	
	@Autowired
	private productService productservice;
	
	@PostMapping
	public ResponseEntity<?> insertProduct(@RequestBody productEntity p){
		productservice.insertProduct(p);
		return new ResponseEntity<String>("insertion done",HttpStatus.CREATED);
	}
	@DeleteMapping("/{pid}")
      public ResponseEntity<?> deleteProduct(@PathVariable("pid") int pid) {
		//System.out.println(id);
		productservice.deleteProduct(pid);
		return new ResponseEntity<String>("deletion done",HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<Iterable<productEntity>> getProducts()
	{
		Iterable<productEntity> rece=productservice.getProducts();
		return new ResponseEntity<Iterable<productEntity>>(rece,HttpStatus.OK);

	}
	
	@PutMapping
	public void updateProduct(productEntity p) {
	/*	productEntity pro=new productEntity();
		int no=pro.getPid();
		productEntity pr=new productEntity();
    	pr=productservice.getProduct(no);
    	pro.setCatagory(pr.getCatagory());
    	pro.setPname(pr.getPname());
    	pro.setPrice(pr.getPrice());
    	pro.setQuantity(pr.getQuantity());
    	productservice.insertProduct(pro);*/
		 productservice.updateProduct(p);
			}

	/*@RequestMapping
	public ResponseEntity<Iterable<productEntity>> findByCatagory(@RequestBody String catagory)
	{
		Iterable<productEntity> rece=productservice.findByCatagory(catagory);
		return new ResponseEntity<Iterable<productEntity>>(rece,HttpStatus.OK);

	}
	@RequestMapping
	public ResponseEntity<Iterable<productEntity>> findByPname(@RequestBody String pname)
	{
		Iterable<productEntity> rece=productservice.findByPname(pname);
		return new ResponseEntity<Iterable<productEntity>>(rece,HttpStatus.OK);

	}*/

}
