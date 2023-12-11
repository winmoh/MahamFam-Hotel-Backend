package com.MahamGrouphotel.MahamHotel.Model;


import jakarta.persistence.*;
import lombok.*;

import javax.sql.rowset.serial.SerialBlob;
import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name="room_number",unique = true)
    private int rnumber;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private Long roomPrice;
    private boolean isBooked;

    @Lob
    private Blob photo;//binary large objetc for storinglarage ammount of bnary data that saly represeent images,files or audio ...


    @OneToMany(mappedBy="room",cascade=CascadeType.ALL)
    private List<BookedRoom> bookings ;



}
