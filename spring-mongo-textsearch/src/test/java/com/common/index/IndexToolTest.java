package com.common.index;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.data.mongodb.core.index.TextIndexDefinition.TextIndexDefinitionBuilder;

import com.common.model.Order;
import com.common.model.OrderDetails;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-config.xml"})
public class IndexToolTest {

	@Autowired
	private MongoTemplate mongoTemplate;
	

	@Test
	public void testCreateIndexRemainingFielsd() {
		/*mongoTemplate.indexOps(Order.class).ensureIndex(new TextIndexDefinitionBuilder()
		.onField("OrderID").build());*/
		
		mongoTemplate.indexOps(Order.class).ensureIndex(new TextIndexDefinitionBuilder()
		.onAllFields().build());
	}
	
	
	@Test
	public void testCreateIndexOnOrderDetails(){
		mongoTemplate.indexOps(OrderDetails.class).ensureIndex(new TextIndexDefinitionBuilder()
		//.onField("OrderID")
		.onField("ProductID")
		.onField("UnitPrice")
		.onField("Quantity").onField("Discount").build());
	}
}
