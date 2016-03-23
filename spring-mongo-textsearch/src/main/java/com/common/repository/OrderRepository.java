package com.common.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.repository.CrudRepository;

import com.common.model.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{
	List<Order> findByOrderId(TextCriteria criteria);
}
