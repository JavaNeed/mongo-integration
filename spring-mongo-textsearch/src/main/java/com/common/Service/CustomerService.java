package com.common.Service;

import java.util.Collection;
import java.util.List;

import com.common.model.Customer;

public interface CustomerService {
	List<Customer> findByContactTitle(String contactTitle);
	List<Customer> findByCityOrCountry(String city, String country);
	List<Customer> findByCityIn(Collection<String> city);
	List<Customer> findByCityNotIn(Collection<String> city);
	List<Customer> findByCompanyNameLike(String companyName);
	List<Customer> findByRegionNull();
}
