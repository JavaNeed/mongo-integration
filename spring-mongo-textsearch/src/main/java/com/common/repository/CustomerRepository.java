package com.common.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.common.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

	List<Customer> findByContactTitle(String contactTitle);
	
	List<Customer> findByCityOrCountry(String city, String country);
	
	// { "city" : { "$in" : [ "Berlin" , "México D.F." , "London"]}}
	List<Customer> findByCityIn(Collection<String> city);
	
	// { "city" : { "$nin" : [ "Berlin" , "México D.F." , "London"]}}
	List<Customer> findByCityNotIn(Collection<String> city);
	
	// { "CompanyName" : { "$regex" : "Pericles"}}
	List<Customer> findByCompanyNameLike(String companyName);
	
	@Query("{ 'Region' : 'NULL' }")
	List<Customer> findByRegionNull();
	
	@Query("{ 'Region' : { '$ne' :  'NULL' }}")
	List<Customer> findByRegionNotNull();
}
