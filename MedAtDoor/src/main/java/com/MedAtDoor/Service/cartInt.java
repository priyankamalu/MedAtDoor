package com.MedAtDoor.Service;

import java.util.List;

import com.MedAtDoor.Entity.cartEntity;
import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Entity.userEntity;

public interface cartInt {
public cartEntity addToCart(cartEntity cart);
public List<cartEntity> findAllByUidCart(int id);
	
 //List<cartEntity> getByuserid(int id);
//productEntity getProduct(int id);
	
	public void deleteCart(int id);

}
