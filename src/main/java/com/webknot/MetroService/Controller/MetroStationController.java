package com.webknot.MetroService.Controller;

import com.webknot.MetroService.Dto.MetroStationDto;
import com.webknot.MetroService.Entity.MetroStation;
import com.webknot.MetroService.Service.MetroStationService;
import jakarta.validation.Valid;
import lombok.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.*;

@RestController
@Slf4j
@RequestMapping("/api/v1/stations")
@Tag(name = "Metro Station Controller", description = "Manages Metro Station Data")
@RequiredArgsConstructor
public class MetroStationController {
    private final MetroStationService metroStationService;

    public ResponseEntity<String> createStation(@RequestBody MetroStationDto metroStationDto) {
        log.info("Adding new station: {}", metroStationDto.getStationName());
        metroStationService.createStation(metroStationDto);
        return ResponseEntity.ok("Station added successfully.");
    }

    @GetMapping()
    public ResponseEntity<List<MetroStation>> getAllStations() {
        log.info("Fetching all metro stations.");
        return ResponseEntity.ok(metroStationService.getAllStations());
    }

}
