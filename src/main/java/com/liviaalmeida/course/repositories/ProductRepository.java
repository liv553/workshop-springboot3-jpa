package com.liviaalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liviaalmeida.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
