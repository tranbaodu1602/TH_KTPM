package ktpm.cau1.service;

import java.util.List;

import ktpm.cau1.model.Order;

public interface OrderService {
	Order save(Order order);
	List<Order> getOrders();
}
