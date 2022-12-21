package com.MedAtDoor.Service;

import java.util.List;

import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Entity.userEntity;

public interface userInt {
	boolean insertUser(userEntity u);
	userEntity findByUid(int uid);
	Boolean validateUser(userEntity u);
	Iterable<userEntity>getusers();

}
