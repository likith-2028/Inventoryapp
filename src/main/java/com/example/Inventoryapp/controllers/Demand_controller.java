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

import com.example.Inventoryapp.main.Demandtools;
import com.example.Inventoryapp.repositories.*;
import com.example.Inventoryappjavamodels.*;



@RestController()
public class Demand_controller {
	//hi
	@Autowired
	Demand_repos demandRepository;
	
	@Autowired
	Location_repos locationRepository;
	
	@Autowired
	Item_repos itemRepository;
	
	//@PutMapping("/demand")
	@PostMapping("/demand")
	public Demand postDemand(@RequestBody Demandtools demandtools) {
		System.out.println(demandtools.toString());
		Demand demand = new Demand();
		
		demand.setItemid(demandtools.getItemid());
		demand.setLocationid(demandtools.getLocationid());
		demand.setQuantity(demandtools.getQuantity());
		demand.setDemandType(demandtools.getDemandType());
		demand.setDemandid(demandtools.getDemandid());
		demandRepository.save(demand);
		return demand;	
	}
	
	@GetMapping("/supply")
	public List<Demand> getAllSupply(){
		return demandRepository.findAll();
	}
	
	@GetMapping("/demand/{itemid}")
	public List<Demand> getDemandByItemid(@PathVariable int itemid){
		System.out.println("hai");
		Items item = itemRepository.findById(itemid).get();
		System.out.println(item);
		return demandRepository.findByItemid(item);
	}
	
	@DeleteMapping("/demand/{locationid}/{itemid}")
	public List<Demand> deleteSupplyByItems(@PathVariable(name = "locationid") int locationid,@PathVariable(name = "itemid") int itemid) {
		List<Demand> demand = demandRepository.findByItemidLocationid(itemid,locationid);
		System.out.println(demand);
		demandRepository.deleteAll(demand);
		return demand;
	}
	
	@PutMapping("/demand")
	public Demand putDemand(@RequestBody Demandtools demandtools) {
		System.out.println(demandtools.toString());
		Demand demand = new Demand();
		Items item;
		item = itemRepository.findById(demandtools.getItemid()).get();
		if(item==null) {
			System.out.println("itemnull");
			return null;
		}
		Location location;
		location = locationRepository.findById(demandtools.getLocationid()).get();
		if(location==null) {
			System.out.println("location null");
			return null;
		}
		
		demand.setItemid(demandtools.getItemid());
		demand.setLocationid(demandtools.getLocationid());
		demand.setQuantity(demandtools.getQuantity());
		demand.setDemandType(demandtools.getDemandType());
		demand.setDemandid(demandtools.getDemandid());
		demandRepository.save(demand);
		return demand;	
	}
}

