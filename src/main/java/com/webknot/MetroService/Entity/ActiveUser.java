package com.webknot.MetroService.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "active_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActiveUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private UserProfiles user;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private MetroStation currentStation;
}
