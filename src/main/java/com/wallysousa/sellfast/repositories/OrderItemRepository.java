package com.wallysousa.sellfast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallysousa.sellfast.entities.OrderItem;
import com.wallysousa.sellfast.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
