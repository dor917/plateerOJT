package com.hotel.repository;

import com.hotel.model.AdminUser;
import com.hotel.model.RoomBookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AdminManageRepository extends JpaRepository<RoomBookingDetails,Integer> {

    @Modifying
    @Query("update RoomBookingDetails b set b.reserveCheck = :reserveCheck where b.id = :id")
    void reserveUpdate(Integer id, int reserveCheck);
}
