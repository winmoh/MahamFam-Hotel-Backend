package com.MahamGrouphotel.MahamHotel.Repository;

import com.MahamGrouphotel.MahamHotel.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
