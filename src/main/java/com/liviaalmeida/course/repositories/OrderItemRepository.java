package com.liviaalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liviaalmeida.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	


}
