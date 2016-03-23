package com.common.index;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.Service.OrderService;
import com.common.model.Order;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class OrderTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrderTest.class);

	@Autowired
	private OrderService orderService; 

	@Test
	public void testOrderSearch() {
		LOGGER.debug("---- testOrderSearch -----");
		
		// Working Scenarios
		//List<Order> orders =orderService.findAllBy("PRINI");
		
		//List<Order> orders =orderService.findAllBy("7");
		
		// { "$text" : { "$search" : "2"}}
//		List<Order> orders =orderService.findAllBy("2");
		
		List<Order> orders =orderService.findAllBy("1756");
		
		LOGGER.debug("SIZE  : ["+orders.size()+"]");
		for (Order order : orders) {
			LOGGER.debug("--------------------------------------");
			LOGGER.debug(order.getCustomerId());
			LOGGER.debug(order.getShipName());
			LOGGER.debug(""+order.getShipCountry());
			LOGGER.debug(""+order.getShipPostalCode());
			LOGGER.debug(order.getShipRegion());
			LOGGER.debug(""+order.getEmployeeId());
		}
	}
}
