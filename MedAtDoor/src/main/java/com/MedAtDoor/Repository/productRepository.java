package com.MedAtDoor.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.MedAtDoor.Entity.productEntity;
@Repository
public interface productRepository extends CrudRepository<productEntity, Integer>{

}
