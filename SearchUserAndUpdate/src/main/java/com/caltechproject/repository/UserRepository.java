package com.caltechproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.caltechproject.entity.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
public User findByName(String name);
}
