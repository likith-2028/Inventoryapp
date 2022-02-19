package com.example.Inventoryapp.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Inventoryappjavamodels.Location;



@RepositoryRestResource(collectionResourceRel = "location",path = "locations" )
public interface Location_repos extends JpaRepository<Location, Integer> {

}


