package com.example.webdevserverjava.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.webdevserverjava.models.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("SELECT user FROM User user WHERE user.username=:username AND user.password=:password")
	public User findUserByCredentials(@Param("username") String username, @Param("password") String password);
}
