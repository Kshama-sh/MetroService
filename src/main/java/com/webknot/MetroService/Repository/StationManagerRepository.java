package com.webknot.MetroService.Repository;

import com.webknot.MetroService.Entity.MetroStation;
import com.webknot.MetroService.Entity.StationManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationManagerRepository extends JpaRepository<StationManager, Long> {
}
