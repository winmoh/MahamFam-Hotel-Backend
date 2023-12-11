package com.MahamGrouphotel.MahamHotel.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    private String name;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="users_roles",
    joinColumns = @JoinColumn(name="role",referencedColumnName = "role_id"),
    inverseJoinColumns =@JoinColumn(name="user",referencedColumnName = "user_id"))
    private Collection<User> users ;



}
