package edu.wgu.d387_sample_code.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/time")
@CrossOrigin(origins = "http://localhost:4200")

public class TimezoneController {
    @GetMapping("/convert")
        public String convertTimeZone(){
        return Timezone.convertTime();
    }
}
