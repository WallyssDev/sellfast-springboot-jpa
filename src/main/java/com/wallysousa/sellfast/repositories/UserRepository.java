package com.wallysousa.sellfast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallysousa.sellfast.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
