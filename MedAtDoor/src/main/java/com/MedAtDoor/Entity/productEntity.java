package com.MedAtDoor.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="product")
public class productEntity {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="pid")
	 private int pid;
	 @Column(name="pname")
	 private String pname; 
	 @Column(name="catagory")
	 private String catagory; 
	 @Column(name="price")
	 private int price; 
	 @Column(name="quantity")
	 private int quantity;
	 
	/*@ManyToMany(mappedBy="products")//,fetch=FetchType.LAZY)
	private List<userEntity> user=new ArrayList<>();
	*/
	
	 public productEntity() {
		 super();
	 }
	public productEntity(int pid, String pname, String catagory, int price, int quantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.catagory = catagory;
		this.price = price;
		this.quantity = quantity;
	}
	
	
/*	public List<userEntity> getUser() {
		return user;
	}
	public void setUser(List<userEntity> user) {
		this.user = user;
	}*/
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}