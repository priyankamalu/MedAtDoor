package com.MedAtDoor.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MedAtDoor.Entity.userEntity;
@Repository
public interface userRepository extends CrudRepository<userEntity, Integer>{

	userEntity findByUid(int uid);

}
