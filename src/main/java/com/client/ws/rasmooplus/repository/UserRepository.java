package com.client.ws.rasmooplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.ws.rasmooplus.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
