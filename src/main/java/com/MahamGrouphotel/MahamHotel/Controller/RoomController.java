package com.MahamGrouphotel.MahamHotel.Controller;

import com.MahamGrouphotel.MahamHotel.DTO.RoomDTO;
import com.MahamGrouphotel.MahamHotel.Model.RoomType;
import com.MahamGrouphotel.MahamHotel.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping(value = "/addRoom", consumes = {"multipart/form-data"})
    public ResponseEntity<String> addNewRoom(@ModelAttribute RoomDTO roomDTO) throws SQLException, IOException {
        return new ResponseEntity<String>(roomService.addNewRoom(roomDTO), null, HttpStatus.OK);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<String>> getAllRooms() {
        return new ResponseEntity<List<String>>(roomService.getAllRooms().stream().map(room -> room.toString()).toList(), null, HttpStatus.OK);
    }

    @GetMapping("/getAllRoomTypes")
    public List<RoomType> getAllRoomTypes()
    {
        return Arrays.asList(RoomType.values());
    }
}