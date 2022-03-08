package com.example.Inventoryapp.javamodels;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;


@Entity(name = "location")
public class Location {

	@Column(name = "locationid")
	@Id
	private int locationid;
	
	@Column(name = "locationDesc")
	private String locationDesc;

	@Column(name = "locationType")
	private String locationType;

	@Column(name = "pickupAllowed")
	private boolean pickupAllowed;

	@Column(name = "shippingAllowed")
	private boolean shippingAllowed;

	@Column(name = "deliveryAllowed")
	private boolean deliveryAllowed;

	@Column(name = "addressLine1")
	private String addressLine1;

	@Column(name = "addressLine2")
	private String addressLine2;

	@Column(name = "addressLine3")
	private String addressLine3;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pincode")
	private int pincode;
	

	public Location() {
		super();
	}

	public Location(int locationid, String locationDesc, String locationType, boolean pickupAllowed,
			boolean shippingAllowed, boolean deliveryAllowed, String addressLine1, String addressLine2,
			String addressLine3, String city, String state, String country, int pincode) {
		super();
		this.locationid = locationid;
		this.locationDesc = locationDesc;
		this.locationType = locationType;
		this.pickupAllowed = pickupAllowed;
		this.shippingAllowed = shippingAllowed;
		this.deliveryAllowed = deliveryAllowed;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.addressLine3 = addressLine3;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public String getLocationDesc() {
		return locationDesc;
	}

	public void setLocationDesc(String locationDesc) {
		this.locationDesc = locationDesc;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
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

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
}

	