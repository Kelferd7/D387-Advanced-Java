package edu.wgu.d387_sample_code.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.TimeZone;


@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TimezoneController {
    @GetMapping("/presentation")
    public ResponseEntity<String> presentation(){
        String announcement = "Join us for a presentation at: " + Timezone.convertTime();
        return new ResponseEntity<String> (announcement, HttpStatus.OK);
    }
}
