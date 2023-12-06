package com.MahamGrouphotel.MahamHotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String  firstname;
    private String lastname;

    private String email;
    private String password;

    @ManyToMany(mappedBy="users")
    private Collection<Role> roles;
}
