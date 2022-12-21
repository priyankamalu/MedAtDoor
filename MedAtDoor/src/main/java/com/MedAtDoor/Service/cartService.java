package com.MedAtDoor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MedAtDoor.Entity.cartEntity;
import com.MedAtDoor.Entity.userEntity;
import com.MedAtDoor.Repository.cartRepository;
import com.MedAtDoor.Repository.userRepository;

@Service
public class cartService implements cartInt {
	@Autowired
	private cartRepository cartrepository;
	
	@Autowired
	private userRepository userrepo;

	@Override
	public cartEntity addToCart(cartEntity cart) {
		return cartrepository.save(cart);
	}

		@Override
	public void deleteCart(int id) {
		cartrepository.deleteById(id);
	}

	@Override
	public List<cartEntity> findAllByUidCart(int id) {
		
		return cartrepository.findAllByUserUid(id);
		 
	}
	

}
