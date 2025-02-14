package com.webknot.MetroService.Service;

import com.webknot.MetroService.Dto.UserProfilesDto;
import com.webknot.MetroService.Entity.ActiveUser;
import com.webknot.MetroService.Entity.CheckinCheckout;
import com.webknot.MetroService.Entity.MetroStation;
import com.webknot.MetroService.Entity.Status;
import com.webknot.MetroService.Repository.ActiveUserRepository;
import com.webknot.MetroService.Repository.CheckinCheckoutRepository;
import com.webknot.MetroService.Repository.MetroStationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class CheckinCheckoutService {
    private final RestTemplate restTemplate;

    @Autowired
    private CheckinCheckoutRepository checkinCheckoutRepository;

    @Autowired
    private MetroStationRepository metroStationRepository;

    @Autowired
    private ActiveUserRepository activeUserRepository;

    @Autowired
    public CheckinCheckoutService(ActiveUserRepository activeUserRepository, RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    public UserProfilesDto getUserById(Long userId) {
        String url = "http://localhost:8080/api/v1/users/" + userId;
        return restTemplate.getForObject(url, UserProfilesDto.class);
    }

}
