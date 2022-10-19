package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
