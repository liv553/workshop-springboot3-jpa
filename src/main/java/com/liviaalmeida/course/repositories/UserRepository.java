package com.liviaalmeida.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liviaalmeida.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
