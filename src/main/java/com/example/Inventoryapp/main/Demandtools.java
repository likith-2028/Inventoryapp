package com.example.Inventoryapp.main;


public class Demandtools {
	private int demandid;
	private String demandType;
	private int quantity;
	private int locationid;
	private int itemid;
	
	public Demandtools() {
		super();
	}
	
	public Demandtools(int demandid, String demandType, int quantity, int locationid, int itemid) {
		super();
		this.demandid = demandid;
		this.demandType = demandType;
		this.quantity = quantity;
		this.locationid = locationid;
		this.itemid = itemid;
	}
	   

	public int getDemandid() {
		return demandid;
	}

	public void setDemandid(int demandid) {
		this.demandid = demandid;
	}

	public String getDemandType() {
		return demandType;
	}

	public void setDemandType(String demandType) {
		this.demandType = demandType;
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

	@Override
	public String toString() {
		return "DemandUtilClass [demandid=" + demandid + ", demandType=" + demandType + ", quantity=" + quantity
				+ ", locationid=" + locationid + ", itemid=" + itemid + "]";
	}

}

