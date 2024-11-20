package com.onlineshop.onlineshop_java.repositories;

import com.onlineshop.onlineshop_java.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByName(String username);


    List<User> id(int id);
}
