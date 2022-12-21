package com.MedAtDoor.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Entity.userEntity;
import com.MedAtDoor.Repository.userRepository;

@Service

public class userService implements userInt {
	
	private userRepository userrepo;
	userService( userRepository userrepo){
		this.userrepo=userrepo;
	}

	@Override
	public boolean insertUser(userEntity u) {
		boolean f=true;
		userrepo.save(u);
		return f;
	}
	
		public userEntity findByUid(int uid)
		
		{
			//int id=u.getUid();
			
			return userrepo.findByUid(uid);
		}
		
		public Boolean validateUser(userEntity u) {
			return null;
		}
		public Iterable<userEntity> getusers() {
			
			return userrepo.findAll();
		}

}
