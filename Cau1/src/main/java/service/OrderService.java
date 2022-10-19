package service;

import java.util.ArrayList;


import entity.Order;

public interface OrderService {
	public ArrayList<Order> findAll();
	public Order save(Order order);

}
