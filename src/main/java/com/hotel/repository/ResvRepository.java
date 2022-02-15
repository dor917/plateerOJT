package com.hotel.repository;

import com.hotel.model.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResvRepository extends JpaRepository<Rooms, Integer> {
    @Query("select r from Rooms r where not exists (select b.room_type from RoomBookingDetails b where b.check_in_date <= :check_in_date and b.check_out_date >= :check_out_date)")
    public List<Rooms> getList(String check_in_date, String check_out_date);
}
