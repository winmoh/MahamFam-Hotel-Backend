package com.MahamGrouphotel.MahamHotel.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private RoomType roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;

    @Lob
    private Blob photo;//binary large objetc for storinglarage ammount of bnary data that saly represeent images,files or audio ...

    @OneToMany(mappedBy="room",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name = "bonking_id",referencedColumnName="Id" )
    private List<BookedRoom> bookings ;



}
