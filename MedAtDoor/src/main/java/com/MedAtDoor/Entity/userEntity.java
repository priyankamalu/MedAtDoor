package com.MedAtDoor.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



@Entity
@Table(name="user")
public class userEntity {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(name="uid")
 private int uid;
 @Column(name="uname")
 private String uname; 
 @Column(name="upassword")
 private String upassword; 
 @Column(name="contact_no")
 private String contact_no; 
 @Column(name="address")
 private String address;
 @Column(name="role")
 private String role;
 
 @OneToOne(targetEntity = userEntity.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "uid")
	private userEntity user;

	@ManyToOne()
	@JoinColumn(name = "pid")
	private productEntity product;
 
/* @ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
 @JoinTable(name="user_product",
 joinColumns= {@JoinColumn(name="uid_u",referencedColumnName="uid")},
 inverseJoinColumns= {@JoinColumn(name="pid_p",referencedColumnName="pid")})
 private List<productEntity> products=new ArrayList<>();
 */
 
 public userEntity() {
	 super();
 }
public userEntity(int uid, String uname, String upassword, String contact_no, String address) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.upassword = upassword;
	this.contact_no = contact_no;
	this.address = address;
}


public String getRloe() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
/*
public List<productEntity> getProducts() {
	return products;
}
public void setProducts(List<productEntity> products) {
	this.products = products;
}*/

public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpassword() {
	return upassword;
}
public void setUpassword(String upassword) {
	this.upassword = upassword;
}
public String getContact_no() {
	return contact_no;
}
public void setContact_no(String contact_no) {
	this.contact_no = contact_no;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
 
}
