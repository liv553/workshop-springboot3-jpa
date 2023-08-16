package com.liviaalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liviaalmeida.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
