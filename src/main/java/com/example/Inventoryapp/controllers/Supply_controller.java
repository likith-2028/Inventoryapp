package com.example.Inventoryapp.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inventoryapp.main.Supplies;
import com.example.Inventoryapp.repositories.*;
import com.example.Inventoryappjavamodels.*;


@RestController()
public class Supply_controller {
	
	@Autowired
	Supply_repos supplyRepository;
	
	@Autowired
	Location_repos locationRepository;
	
	@Autowired
	Item_repos itemRepository;
	
	//@PutMapping("/supply")
	@PostMapping("/supply")
	public Supply postSupply(@RequestBody Supplies supplies) {
		System.out.println(supplies.toString());
		Supply supply = new Supply();
		
		supply.setItemid(supplies.getItemid());
		supply.setLocationid(supplies.getLocationid());
		supply.setQuantity(supplies.getQuantity());
		supply.setSupplyType(supplies.getSupplyType());
		supply.setSupplyid(supplies.getSupplyid());
		supplyRepository.save(supply);
		return supply;	
	}
	
	@GetMapping("/supply")
	public List<Supply> getAllSupply(){
		return supplyRepository.findAll();
	}
	
	@GetMapping("/supply/{itemid}")
	public List<Supply> getSupplyByItemid(@PathVariable int itemid){
		System.out.println("hai");
		Items item = itemRepository.findById(itemid).get();
		System.out.println(item);
		return supplyRepository.findByItemid(item);
	}
	
	@DeleteMapping("/supply/{locationid}/{itemid}")
	public List<Supply> deleteSupplyByItems(@PathVariable(name = "locationid") int locationid,@PathVariable(name = "itemid") int itemid) {
		List<Supply> supply = supplyRepository.findByItemidLocationid(itemid,locationid);
		System.out.println(supply);
		supplyRepository.deleteAll(supply);
		return supply;
	}
	
	@PutMapping("/supply")
	public Supply putSupply(@RequestBody Supplies supplies) {
		System.out.println(supplies.toString());
		Supply supply = new Supply();
		Items item;
		item = itemRepository.findById(supplies.getItemid()).get();
		if(item==null) {
			System.out.println("itemnull");
			return null;
		}
		Location location;
		location = locationRepository.findById(supplies.getLocationid()).get();
		if(location==null) {
			System.out.println("location null");
			return null;
		}
		
		supply.setItemid(item);
		supply.setLocationid(location);
		supply.setQuantity(supplies.getQuantity());
		supply.setSupplyType(supplies.getSupplyType());
		supply.setSupplyid(supplies.getSupplyid());
		supplyRepository.save(supply);
		return supply;	
	}
}

