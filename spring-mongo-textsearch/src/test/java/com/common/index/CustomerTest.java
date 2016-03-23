package com.common.index;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.common.Service.CustomerService;
import com.common.model.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class CustomerTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerTest.class);
	
	@Autowired
	private CustomerService cService;

	@Test
	public void testCustomerByContactTitle() {
		LOGGER.debug("-----  testCustomerByContactTitle  --------");
		
		List<Customer> customers = cService.findByContactTitle("Sales Agent");
		LOGGER.debug("SIZE : "+customers.size());
		for (Customer customer : customers) {
			LOGGER.debug("-------------------------------------------");
			LOGGER.debug("CustomerID   : "+customer.getCustomerId());
			LOGGER.debug("ContactTitle : "+customer.getContactTitle());
		}
	}
	
	
	@Test
	public void testCustomerByCityOrCountry() {
		LOGGER.debug("-----  testCustomerByCityOrCountry  --------");
		
		List<Customer> customers = cService.findByCityOrCountry("", "Argentina");
		LOGGER.debug("SIZE : "+customers.size());
		for (Customer customer : customers) {
			LOGGER.debug("-------------------------------------------");
			LOGGER.debug("Ciry         : "+customer.getCity());
			LOGGER.debug("Country      : "+customer.getCountry());
			LOGGER.debug("CustomerID   : "+customer.getCustomerId());
			LOGGER.debug("ContactTitle : "+customer.getContactTitle());
		}
	}

	
	@Test
	public void testCustomerByCityIn() {
		LOGGER.debug("-----  testCustomerByCityOrCountry  --------");
		
		// In
		List<Customer> customers = cService.findByCityIn(Arrays.asList("Berlin","México D.F.","London"));
		LOGGER.debug("SIZE : "+customers.size());
		for (Customer customer : customers) {
			LOGGER.debug("-------------------------------------------");
			LOGGER.debug("City         : "+customer.getCity());
			LOGGER.debug("Country      : "+customer.getCountry());
			LOGGER.debug("CustomerID   : "+customer.getCustomerId());
			LOGGER.debug("ContactTitle : "+customer.getContactTitle());
		}
		
		// NotIn
		List<Customer> cust = cService.findByCityNotIn(Arrays.asList("Berlin","México D.F.","London"));
		LOGGER.debug("SIZE : "+cust.size());
		for (Customer customer : cust) {
			LOGGER.debug("-------------------------------------------");
			LOGGER.debug("City         : "+customer.getCity());
		}
	}
	
	@Test
	public void testCompanyNameLike(){
		List<Customer> customers =cService.findByCompanyNameLike("Pericles"); 
		LOGGER.debug("SIZE : "+customers.size());
	}
	
	@Test
	public void testRegionNull(){
		List<Customer> customers =cService.findByRegionNull(); 
		LOGGER.debug("SIZE : "+customers.size());
	}
}
