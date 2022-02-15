package com.hotel.repository;

import com.hotel.model.Admin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminLoginRepository extends CrudRepository<Admin, Integer> {
    @Query("select a from Admin a where a.username like :name")
    Admin findByNameContaining(String name);
}
