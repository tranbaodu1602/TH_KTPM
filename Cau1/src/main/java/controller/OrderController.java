package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import entity.Order;
import service.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
	@Autowired
	private OrderService orderService;
	@GetMapping("/order")
	public List<Order> findAlls() {
		List<Order> orders = orderService.findAll();
		System.out.println(orders);
		return orderService.findAll();
	}
	@GetMapping("/order/save")
	public Order saveChuyenBay(@RequestBody Order order) { 
//		Order or1 = new Order("OD19509301", "Tran Bao Du",2022);
		return orderService.save(order);
	}
}
