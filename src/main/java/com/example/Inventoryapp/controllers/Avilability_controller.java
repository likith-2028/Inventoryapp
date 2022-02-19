package com.example.Inventoryapp.controllers;


import java.awt.print.Printable;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Inventoryapp.main.Tools;
import com.example.Inventoryapp.repositories.*;


@RestController
public class Avilability_controller {
	
	@Autowired
	Item_repos itemRepository;
	
	@Autowired
	Location_repos locationRepository;
	
	@Autowired
	Supply_repos supplyRepository;
	
	@Autowired
	Demand_repos demandRepository;
	
	@GetMapping("/availability/{itemid}/{locationid}")
	public int getAvilabilityByItemLocation(@PathVariable(name = "itemid") int itemid,@PathVariable(name = "locationid") int locationid) {
		System.out.println(itemid+locationid);
		List<Integer> onHandItemAvilable = supplyRepository.getOnHandCount(itemid, locationid);
		System.out.println(onHandItemAvilable);
		List<Integer> hardPromisedAvilable = demandRepository.getHardPromisedCount(itemid, locationid);
		System.out.println(hardPromisedAvilable);
		return (new Tools().sumofIntList(onHandItemAvilable))-(new Tools().sumofIntList(hardPromisedAvilable));
	}
	
	@GetMapping(path = "/availability/{itemid}")
	public int getAvilabilityByItem(@PathVariable(name = "itemid") int itemid) {
		System.out.println(itemid);
		List<Integer> onHandItemAvilable = supplyRepository.getOnHandCountByOnlyItemid(itemid);
		List<Integer> hardPromisedAvilable = demandRepository.getHardPromisedCountByOnlyItemid(itemid);
		return (new Tools().sumofIntList(onHandItemAvilable))-(new Tools().sumofIntList(hardPromisedAvilable));
	}

}