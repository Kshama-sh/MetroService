package com.webknot.MetroService.Repository;

import com.webknot.MetroService.Entity.CheckinCheckout;
import com.webknot.MetroService.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface CheckinCheckoutRepository extends JpaRepository<CheckinCheckout, Long> {
}

