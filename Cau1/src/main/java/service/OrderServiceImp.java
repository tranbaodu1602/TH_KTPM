package service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.OrderRepository;
import entity.Order;

@Service
public class OrderServiceImp implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	public OrderServiceImp(OrderRepository orderRepository) {
		// TODO Auto-generated constructor stub
		this.orderRepository=orderRepository;
	}
	
	public ArrayList<Order> findAll() {
		return (ArrayList<Order>) orderRepository.findAll();
	}
	
	public Order save(Order order) {
		// TODO Auto-generated method stub
		Order order2=orderRepository.save(order);
		return order2;
	}
	
	
}
