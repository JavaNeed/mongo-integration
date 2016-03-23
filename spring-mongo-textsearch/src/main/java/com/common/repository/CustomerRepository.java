package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, String>{

}
