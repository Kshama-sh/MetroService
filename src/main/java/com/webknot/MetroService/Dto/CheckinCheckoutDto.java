package com.webknot.MetroService.Dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class CheckinCheckoutDto {
    private Long id;
    private Long userId;
    private String sourceStation;
    private String destinationStation;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private Double fare;
}
