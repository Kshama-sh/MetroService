package com.webknot.MetroService.Repository;

import com.webknot.MetroService.Entity.MetroStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;
import java.util.List;
import java.util.Optional;

@Repository
public interface MetroStationRepository extends JpaRepository<MetroStation, Long> {
//    Optional<MetroStation> findByName(String name);
}
