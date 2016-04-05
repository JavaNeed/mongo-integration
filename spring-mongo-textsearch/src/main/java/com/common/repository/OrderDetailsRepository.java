package com.common.repository;

import java.util.List;

import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.repository.CrudRepository;

import com.common.model.OrderDetails;

public interface OrderDetailsRepository extends CrudRepository<OrderDetails, Integer>{

	List<OrderDetails> findAllBy(TextCriteria criteria);
}
