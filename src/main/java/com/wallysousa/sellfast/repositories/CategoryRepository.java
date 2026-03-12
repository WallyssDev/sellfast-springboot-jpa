package com.wallysousa.sellfast.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallysousa.sellfast.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
