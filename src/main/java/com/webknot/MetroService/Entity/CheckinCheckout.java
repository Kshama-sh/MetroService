package com.webknot.MetroService.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "check_in_out")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckinCheckout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private double fare;
//    @ManyToOne
//    @JoinColumn(name = "user_id", nullable = false)
//    private UserProfiles user;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private MetroStation checkInStation;

    @ManyToOne
    @JoinColumn(name = "checkout_station_id")
    private MetroStation checkOutStation;

    @Enumerated(EnumType.STRING)
    private Status status; // Enum for IN_PROGRESS, COMPLETED
}
