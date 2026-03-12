package com.wallysousa.sellfast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallysousa.sellfast.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
