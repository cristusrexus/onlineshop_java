package com.onlineshop.onlineshop_java.repositories;

import com.onlineshop.onlineshop_java.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
