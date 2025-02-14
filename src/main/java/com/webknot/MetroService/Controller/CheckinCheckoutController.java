package com.webknot.MetroService.Controller;

import com.webknot.MetroService.Dto.UserProfilesDto;
import com.webknot.MetroService.Service.CheckinCheckoutService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/checkin-checkout")
@Slf4j
public class CheckinCheckoutController {
    @Autowired
    private CheckinCheckoutService checkinCheckoutService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserProfilesDto> getUserDetails(@PathVariable Long userId) {
        UserProfilesDto user = checkinCheckoutService.getUserById(userId);
        return ResponseEntity.ok(user);
    }
}
