package com.MedAtDoor.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.MedAtDoor.Entity.productEntity;
import com.MedAtDoor.Repository.productRepository;


@Service

public class productService implements productInt {
 // @Autowired
	private productRepository productrepo;
	public productService( productRepository productrepo)
	{ super();
		this.productrepo=productrepo;
	}

	@Override
	public void insertProduct(productEntity p) {
		productrepo.save(p);		
	}

	@Override
	public void deleteProduct(int id) {
		
		productrepo.deleteById(id);
	}

	@Override
	public Iterable<productEntity> getProducts() {
		
		return productrepo.findAll();
	}

	@Override
	public productEntity getProduct(int id) {
		return productrepo.findById(id).get();
	}
    
    @Override
    public void updateProduct(productEntity p)
    {
    	int no=p.getPid();
    	productEntity pro=productrepo.findById(no).get();
    	pro.setCatagory(p.getCatagory());
    	pro.setPname(p.getPname());
    	pro.setPrice(p.getPrice());
    	pro.setQuantity(p.getQuantity());
    	productrepo.save(pro);
    	
    }
    @Override
    public Iterable<productEntity> findByCatagory(@RequestParam String catagory)
    {
    	return findByCatagory(catagory);
    }
    @Override
    public Iterable<productEntity> findByPname(@RequestParam String pname){
    	return findByPname(pname);
    }
 
    
}
