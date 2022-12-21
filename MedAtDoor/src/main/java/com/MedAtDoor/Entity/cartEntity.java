package com.MedAtDoor.Entity;

import javax.persistence.*;

@Entity
@Table(name="cart")
public class cartEntity {
    @Id
    @GeneratedValue
    @Column(name="cid")
    private int cid;
    @Column(name="pname")
    private String pname;
    @Column(name="unit")
    private int unit=1;
    @Column(name="price")
    private int price;
    
    @OneToOne(targetEntity = userEntity.class, fetch = FetchType.EAGER)
	@JoinColumn(nullable = false, name = "uid")
	private userEntity user;

	@ManyToOne()
	@JoinColumn(name = "pid")
	private productEntity product;
    
	public cartEntity() {
		super();
	}
   //int cid, String pname, int unit, int price,
	public cartEntity(userEntity user, productEntity product) {
		//super();
		//this.cid = cid;
		//this.pname = pname;
		//this.unit = unit;
		//this.price = price;
		this.user = user;
		this.product = product;
	}
	
	
	public userEntity getUser() {
		return user;
	}

	public void setUser(userEntity user) {
		this.user = user;
	}

	public productEntity getProduct() {
		return product;
	}

	public void setProduct(productEntity product) {
		this.product = product;
	}

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
    
    

}
