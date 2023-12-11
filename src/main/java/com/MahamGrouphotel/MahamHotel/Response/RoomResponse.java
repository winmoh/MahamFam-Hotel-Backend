package com.MahamGrouphotel.MahamHotel.Response;

import com.MahamGrouphotel.MahamHotel.Model.RoomType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomResponse {
    private RoomType roomType;
    private Long roomPrice;
    private String photo;
    private int rnumber;
}
