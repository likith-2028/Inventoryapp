package com.example.Inventoryappjavamodels;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity(name = "supply")
public class Supply {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "supplyid")
	private int supplyid;
	
	@Column(name = "supplyType")
	private String supplyType;
	
	@Column(name = "quantity")
	private int quantity;

	private int itemid;
	//@ManyToOne(targetEntity = Location.class,cascade = CascadeType.DETACH)
	//@JoinColumn(name = "locationid_fk",referencedColumnName = "locationid")
	private int locationid;
	

	public Supply() {
		super();
	}

	public Supply(int supplyid, String supplyType, int quantity, int itemid, int locationid) {
		super();
		this.supplyid = supplyid;
		this.supplyType = supplyType;
		this.quantity = quantity;
		this.itemid = itemid;
		this.locationid = locationid;
	}

	public int getSupplyid() {
		return supplyid;
	}

	public void setSupplyid(int supplyid) {
		this.supplyid = supplyid;
	}

	public String getSupplyType() {
		return supplyType;
	}

	public void setSupplyType(String supplyType) {
		this.supplyType = supplyType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	@Override
	public String toString() {
		return "Supply [supplyid=" + supplyid + ", supplyType=" + supplyType + ", quantity=" + quantity + ", itemid="
				+ itemid + ", locationid=" + locationid + "]";
	}

	public void setItemid(Items item) {
		// TODO Auto-generated method stub
		
	}

	public void setLocationid(Location location) {
		// TODO Auto-generated method stub
		
	}
}
