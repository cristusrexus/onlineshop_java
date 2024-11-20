package com.onlineshop.onlineshop_java.repositories;

import com.onlineshop.onlineshop_java.models.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandRepository extends JpaRepository<Command, Integer> {
}
