package com.MahamGrouphotel.MahamHotel.Service;

import com.MahamGrouphotel.MahamHotel.DTO.RoomDTO;
import com.MahamGrouphotel.MahamHotel.Model.Room;
import com.MahamGrouphotel.MahamHotel.Repository.RoomRepository;
import com.MahamGrouphotel.MahamHotel.Response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.sql.rowset.serial.SerialBlob;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.List;

@Service
public class RoomService {

    @Autowired
    private  RoomRepository RRepo;

    public String addNewRoom(RoomDTO roomDTO) throws SQLException, IOException {
        if(RRepo.findByRnumber(roomDTO.getRnumber()).isPresent()){
            return "a room with this number already exist";
        }
        else{
            byte[] roomPhoto= roomDTO.getPhoto().getBytes();
            Blob photo=new SerialBlob(roomPhoto);
            Room room= Room.builder()
                    .roomType(roomDTO.getRoomType())
                    .roomPrice(roomDTO.getRoomPrice())
                    .photo(photo)
                    .rnumber(roomDTO.getRnumber())
                    .isBooked(false)
                    .build();
            RRepo.save(room);
            RoomResponse roomResponse=RoomResponse.builder()
                    .roomType(room.getRoomType())
                    .rnumber(room.getRnumber())
                    .roomPrice(room.getRoomPrice())
                    .photo(Base64.getEncoder().encodeToString(room.getPhoto().getBytes(1,(int)room.getPhoto().length())))
                    .build();



            return roomResponse.toString();
        }




    }

    public List<Room> getAllRooms(){
        return RRepo.findAll();

    }


}
