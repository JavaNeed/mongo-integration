package com.common.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Component;

import com.common.model.OrderDetails;
import com.common.repository.OrderDetailsRepository;

@Component
public class OrderDetailsServiceImpl implements OrderDetailsService{
	
	@Autowired
	private OrderDetailsRepository odRepository;
	@Autowired
	private MongoOperations mongoOperations;

	public List<OrderDetails> findAllBy(Integer searchValue) {
		//TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(searchValue);
		TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingPhrase("OrderID")
				.matchingPhrase(String.valueOf(searchValue));
		Query query = TextQuery.queryText(criteria).sortByScore();
		
		List<OrderDetails> orderDetails =mongoOperations.find(query, OrderDetails.class); 
		return orderDetails;
	}
}
