package com.wfasistemas.projeto01.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfasistemas.projeto01.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
