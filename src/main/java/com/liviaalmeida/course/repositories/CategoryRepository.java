package com.liviaalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liviaalmeida.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	

}
