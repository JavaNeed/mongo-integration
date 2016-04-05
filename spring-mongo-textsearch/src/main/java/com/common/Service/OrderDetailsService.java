package com.common.Service;

import java.util.List;

import com.common.model.OrderDetails;

public interface OrderDetailsService {
	List<OrderDetails> findAllBy(Integer searchValue);
}
