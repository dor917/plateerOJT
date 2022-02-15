package com.hotel.repository;

import com.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LoginRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.email = :email")
    public User findUser(String email);
}
