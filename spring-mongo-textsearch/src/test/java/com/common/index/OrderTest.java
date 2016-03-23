package com.common.index;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.model.Order;
import com.common.repository.OrderRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class OrderTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderTest.class);

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private MongoOperations mongoOperations;

	@Test
	public void testOrderSearch() {
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny("Lyon");
		Query query = TextQuery.queryText(criteria).sortByScore();

		List<Order> orders = mongoOperations.find(query, Order.class);
		LOGGER.debug("SIZE  : ["+orders.size()+"]");
		for (Order order : orders) {
			LOGGER.debug("--------------------------------------");
			LOGGER.debug(order.getCustomerId());
			LOGGER.debug(order.getShipName());
			LOGGER.debug(""+order.getShipCountry());
			LOGGER.debug(order.getShipPostalCode());
			LOGGER.debug(order.getShipRegion());
			LOGGER.debug(""+order.getEmployeeId());
		}
	}
}
