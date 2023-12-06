package com.MahamGrouphotel.MahamHotel.Service;

import com.MahamGrouphotel.MahamHotel.Repository.RoomRepository;
import com.MahamGrouphotel.MahamHotel.Response.RoomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private  RoomRepository RRepo;

    public ResponseEntity<RoomResponse>  addNewRoom(){

    }


}
