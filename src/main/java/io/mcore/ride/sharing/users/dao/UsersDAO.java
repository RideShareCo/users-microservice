package io.mcore.ride.sharing.users.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.mcore.ride.sharing.users.model.User;

public interface UsersDAO extends MongoRepository<User, String> {

	public User findByFirstName(String firstName);
	
}
