package com.MedAtDoor.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MedAtDoor.Entity.cartEntity;
import com.MedAtDoor.Entity.userEntity;

@Repository
public interface cartRepository extends CrudRepository<cartEntity, Integer>{

	List<cartEntity> findAllByUserUid(int id);
	
	

}
