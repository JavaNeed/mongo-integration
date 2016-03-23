package com.common.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;

import com.common.model.Order;
import com.common.repository.OrderRepository;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private MongoOperations mongoOperations;

	public List<Order> findAllBy(String searchValue) {
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny("Toms Spezialitäten");
		Query query = TextQuery.queryText(criteria).sortByScore();

		List<Order> orders = mongoOperations.find(query, Order.class);
		return orders;
	}
}
