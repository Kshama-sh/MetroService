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
@Builder
public class CheckinCheckout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private ActiveUser user;

    @ManyToOne
    @JoinColumn(name = "entry_station_id", nullable = false)
    private MetroStation entryStation;

    @ManyToOne
    @JoinColumn(name = "exit_station_id")
    private MetroStation exitStation;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(nullable = false)
    private LocalDateTime checkInTime;

    private LocalDateTime checkOutTime;

    private Double fare;  // Enum for IN_PROGRESS, COMPLETED
}
