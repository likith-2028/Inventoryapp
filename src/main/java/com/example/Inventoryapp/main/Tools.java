package com.example.Inventoryapp.main;


import java.util.List;

public class Tools {
	public int sumofIntList(List<Integer>list) {
		int sum = 0;
		for(int i:list)
			sum = sum + i;
		return sum;
	}

}