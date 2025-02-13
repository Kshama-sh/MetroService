package com.webknot.MetroService.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "metro_station")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MetroStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String stationName;
    private String route;
}