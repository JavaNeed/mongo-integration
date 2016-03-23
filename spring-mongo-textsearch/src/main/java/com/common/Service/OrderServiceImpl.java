package com.common.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.TextCriteria;

import com.common.model.Order;
import com.common.repository.OrderRepository;

public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findByOrderId(Integer orderId) {
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny("release").notMatching("engineering");
		List<Order> orders = orderRepository.findByOrderId(criteria);
		return orders;
	}

}
