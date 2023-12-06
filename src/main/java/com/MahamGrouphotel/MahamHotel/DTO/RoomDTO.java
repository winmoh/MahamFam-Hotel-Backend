package com.MahamGrouphotel.MahamHotel.DTO;

import com.MahamGrouphotel.MahamHotel.Model.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomDTO {
    private RoomType roomType;
    private Long roomPrice;
    private boolean isBooked ;

    private String  photo;
}
