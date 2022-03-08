package com.example.Inventoryapp.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Inventoryappjavamodels.*;




@RepositoryRestResource(collectionResourceRel = "demand",path = "demand" )
public interface Demand_repos extends JpaRepository<Demand, Integer>{
	public List<Demand> findByItemid(Items item);
	
	@Query(value = "SELECT * FROM demand WHERE itemid_fk=:itemid AND locationid_fk=:locationid",nativeQuery = true)
	public List<Demand> findByItemidLocationid(@Param("itemid") int itemid,@Param("locationid") int locationid);
	
	@Query(value = "SELECT quantity FROM demand WHERE itemid_fk=:itemid AND locationid_fk=:locationid AND demand_type='HARD_PROMISED'",nativeQuery = true)
	public List<Integer> getHardPromisedCount(@Param("itemid") int itemid,@Param("locationid") int locationid);
	
	@Query(value = "SELECT quantity FROM demand WHERE itemid_fk=:itemid AND demand_type='HARD_PROMISED'",nativeQuery = true)
	public List<Integer> getHardPromisedCountByOnlyItemid(@Param("itemid") int itemid);

}