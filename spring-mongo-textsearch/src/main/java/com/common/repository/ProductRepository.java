package com.common.repository;

import org.springframework.data.repository.CrudRepository;

import com.common.model.Product;

public interface ProductRepository extends CrudRepository<Product, String>{

}
