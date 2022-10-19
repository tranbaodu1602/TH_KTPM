package ktpm.cau1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ktpm.cau1.model.Order;
import ktpm.cau1.repository.OrderRepository;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	private OrderRepository repository;

	@Override
	public Order save(Order order) {
		// TODO Auto-generated method stub
		return repository.save(order);
	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
