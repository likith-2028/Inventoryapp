package com.example.Inventoryapp.main;


public class Supplies {
	private int supplyid;
	private String supplyType;
	private int quantity;
	private int locationid;
	private int itemid;
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
	public int getLocationid() {
		return locationid;
	}
	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public Supplies(int supplyid, String supplyType, int quantity, int locationid, int itemid) {
		super();
		this.supplyid = supplyid;
		this.supplyType = supplyType;
		this.quantity = quantity;
		this.locationid = locationid;
		this.itemid = itemid;
	}
	public Supplies() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SupplyUtilClass [supplyid=" + supplyid + ", supplyType=" + supplyType + ", quantity=" + quantity
				+ ", locationid=" + locationid + ", itemid=" + itemid + "]";
	}
	

}
