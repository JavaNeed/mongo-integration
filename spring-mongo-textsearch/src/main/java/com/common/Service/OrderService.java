package com.common.Service;

import java.util.List;

import com.common.model.Order;

public interface OrderService {
	List<Order> findAllBy(String searchValue);
}
