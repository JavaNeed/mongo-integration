package com.common.Service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.common.model.Customer;
import com.common.repository.CustomerRepository;

@Component
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> findByContactTitle(String contactTitle) {
		List<Customer> customers = customerRepository.findByContactTitle(contactTitle);
		return customers;
	}

	public List<Customer> findByCityOrCountry(String city, String country) {
		List<Customer> customers = customerRepository.findByCityOrCountry(city,country);
		return customers;
	}

	public List<Customer> findByCityIn(Collection<String> city) {
		List<Customer> customers =customerRepository.findByCityIn(city); 
		return customers;
	}

	public List<Customer> findByCityNotIn(Collection<String> city) {
		List<Customer> customers =customerRepository.findByCityNotIn(city); 
		return customers;
	}

	public List<Customer> findByCompanyNameLike(String companyName) {
		List<Customer> customers =customerRepository.findByCompanyNameLike(companyName);
		return customers;
	}

	public List<Customer> findByRegionNull() {
		List<Customer> customers =customerRepository.findByRegionNull();
		return customers;
	}

}
