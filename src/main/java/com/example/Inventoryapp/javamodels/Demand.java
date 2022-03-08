package com.example.Inventoryapp.javamodels;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity(name = "demand")
public class Demand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "demandid")
	private int demandid;
	
	@Column(name = "demandType")
	private String demandType;
	
	@Column(name = "quantity")
	private int quantity;
	
	//@ManyToOne(targetEntity = Items.class,cascade = CascadeType.DETACH)
	//@JoinColumn(name = "itemid_fk",referencedColumnName = "itemid")

	private int itemid;
	//@ManyToOne(targetEntity = Location.class,cascade = CascadeType.DETACH)
	//@JoinColumn(name = "locationid_fk",referencedColumnName = "locationid")

	private int locationid;
	
	public Demand(int demandid, String demandType, int quantity, int itemid, int locationid) {
		super();
		this.demandid = demandid;
		this.demandType = demandType;
		this.quantity = quantity;
		this.itemid = itemid;
		this.locationid = locationid;
	}
	public Demand() {
		super();
		// TODO Auto-generated constructor stub
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
	
}