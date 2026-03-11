package com.wallysousa.sellfast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallysousa.sellfast.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
