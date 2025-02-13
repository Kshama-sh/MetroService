package com.webknot.MetroService.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "station_manager")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StationManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private MetroStation metroStation;
}