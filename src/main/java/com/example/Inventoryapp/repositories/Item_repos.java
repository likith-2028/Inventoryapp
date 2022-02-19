package com.example.Inventoryapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Inventoryappjavamodels.Items;





@RepositoryRestResource(collectionResourceRel = "item",path = "items")
public interface Item_repos extends JpaRepository<Items, Integer> {
}