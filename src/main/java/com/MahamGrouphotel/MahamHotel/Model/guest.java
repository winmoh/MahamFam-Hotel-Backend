package com.MahamGrouphotel.MahamHotel.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class guest{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long guestId;
    private String gestFullName;
    private String  guestEmail;
    private String guestPhone;
    private String guestGender;

}
