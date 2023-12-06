package com.MahamGrouphotel.MahamHotel.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BookedRoom {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long bookingId;

    private LocalDate checkIn;
    private LocalDate checkOut;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="guest",referencedColumnName = "guestId")
    private guest guest;

    private int numOfAdults;
    private int numOfChildren;
    @Column(name="confirmation_code")
    private String bookingConfirmationCode;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="bookedRoom",referencedColumnName = "Id")
    private Room room;


    }
