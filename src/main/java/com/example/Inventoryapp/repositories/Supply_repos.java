package com.example.Inventoryapp.repositories;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.Inventoryappjavamodels.*;





@RepositoryRestResource(itemResourceRel = "supply",path = "supplies")
public interface Supply_repos extends JpaRepository<Supply, Integer>{
	public List<Supply> findByItemid(Items itemid);
	@Query(value = "SELECT * FROM supply WHERE itemid_fk=:itemid AND locationid_fk=:locationid",nativeQuery = true)
	public List<Supply> findByItemidLocationid(@Param("itemid") int itemid,@Param("locationid") int locationid);
	
	@Query(value = "SELECT quantity FROM supply WHERE itemid_fk=:itemid AND locationid_fk=:locationid AND supply_type='ONHAND'",nativeQuery = true)
	public List<Integer> getOnHandCount(@Param("itemid") int itemid,@Param("locationid") int locationid);
	
	@Query(value = "SELECT quantity FROM supply WHERE itemid_fk=:itemid AND supply_type='ONHAND'",nativeQuery = true)
	public List<Integer> getOnHandCountByOnlyItemid(@Param("itemid") int itemid);
}