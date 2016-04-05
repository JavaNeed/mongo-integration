package com.common.index;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.Service.OrderDetailsService;
import com.common.model.OrderDetails;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class OrderDetailsTest {
	@Autowired
	private OrderDetailsService odService;
		
	@Test
	public void test() {
		List<OrderDetails> orderDetails =odService.findAllBy(10248);
		System.out.println("Size : ["+ orderDetails +"]");
		for (OrderDetails od : orderDetails) {
			System.out.println("-------------------------");
			System.out.println(od.getDiscount());
			System.out.println(od.getOrderId());
			System.out.println(od.getProductId());
			System.out.println(od.getQuantity());
			System.out.println(od.getUnitPrice());
			System.out.println(od.getId());
			System.out.println("-----------------------------");
		}
	}
}
