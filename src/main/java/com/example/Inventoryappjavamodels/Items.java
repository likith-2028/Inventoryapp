package com.example.Inventoryappjavamodels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "item")
public class Items {
	
	@Column(name = "itemid")
	@Id
	private int itemid;
	
	@Column(name = "itemDescription")
	private String itemDescription;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "pickupAllowed")
	private boolean pickupAllowed;
	
	@Column(name = "shippingAllowed")
	private boolean shippingAllowed;
	
	@Column(name =  "deliveryAllowed")
	private boolean deliveryAllowed;

	public Items() {
		super();
	}

	public Items(String itemDescription, String category, String type, String status, int price, boolean pickupAllowed,
			boolean shippingAllowed, boolean deliveryAllowed) {
		super();
		this.itemDescription = itemDescription;
		this.category = category;
		this.type = type;
		this.status = status;
		this.price = price;
		this.pickupAllowed = pickupAllowed;
		this.shippingAllowed = shippingAllowed;
		this.deliveryAllowed = deliveryAllowed;
	}

	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isPickupAllowed() {
		return pickupAllowed;
	}

	public void setPickupAllowed(boolean pickupAllowed) {
		this.pickupAllowed = pickupAllowed;
	}

	public boolean isShippingAllowed() {
		return shippingAllowed;
	}

	public void setShippingAllowed(boolean shippingAllowed) {
		this.shippingAllowed = shippingAllowed;
	}

	public boolean isDeliveryAllowed() {
		return deliveryAllowed;
	}

	public void setDeliveryAllowed(boolean deliveryAllowed) {
		this.deliveryAllowed = deliveryAllowed;
	}
}
	