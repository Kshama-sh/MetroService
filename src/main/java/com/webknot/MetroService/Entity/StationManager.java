package com.webknot.MetroService.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "station_manager")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StationManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private MetroStation station;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String contactNumber;
}