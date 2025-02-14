package com.webknot.MetroService.Service;

import com.webknot.MetroService.Dto.MetroStationDto;
import com.webknot.MetroService.Entity.MetroStation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.webknot.MetroService.Repository.*;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MetroStationService {
    private final MetroStationRepository metroStationRepository;

    public List<MetroStation> getAllStations() {
        return metroStationRepository.findAll();
    }

    public MetroStation createStation(MetroStationDto dto) {
        MetroStation metroStation = MetroStation.builder()
                .stationName(dto.getStationName())
                .location(dto.getLocation())
                .isActive(true)
                .build();
        return metroStationRepository.save(metroStation);
    }

}
