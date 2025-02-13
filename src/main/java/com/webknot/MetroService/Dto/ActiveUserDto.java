package com.webknot.MetroService.Dto;

import lombok.Data;

@Data
public class ActiveUserDto {
    private Long userId;
    private String userName;
    private Long stationId;
    private String stationName;
}
