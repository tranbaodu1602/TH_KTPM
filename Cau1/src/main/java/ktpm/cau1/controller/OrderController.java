package ktpm.cau1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ktpm.cau1.model.Order;
import ktpm.cau1.model.OrderDto;
import ktpm.cau1.service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("order/save")
	public Order saveOrder(@RequestBody Order order) {
//		System.out.println(order.getName());
		return service.save(order);
	}
	
	@GetMapping("/orders")
	public List<Order> findAll(){
		return service.getOrders();
	}
}


