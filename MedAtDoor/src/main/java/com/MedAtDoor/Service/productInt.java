package com.MedAtDoor.Service;



import org.springframework.web.bind.annotation.RequestParam;

import com.MedAtDoor.Entity.productEntity;



public interface productInt {
	void insertProduct(productEntity p);
	void deleteProduct(int id);
	Iterable<productEntity> getProducts();
 productEntity getProduct(int id);
 void updateProduct(productEntity p);
 Iterable<productEntity> findByCatagory(@RequestParam String catagory);
 Iterable<productEntity> findByPname(@RequestParam String pname);

}


