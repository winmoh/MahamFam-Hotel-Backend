package com.MahamGrouphotel.MahamHotel.Repository;

import com.MahamGrouphotel.MahamHotel.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
    Optional<Room> findByRnumber(int roomNumber);
}
