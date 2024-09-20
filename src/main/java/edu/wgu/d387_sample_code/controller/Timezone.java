package edu.wgu.d387_sample_code.controller;


import org.springframework.web.bind.annotation.CrossOrigin;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin(origins = "http://localhost:4200")
public class Timezone {

    public static String convertTime() {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        ZonedDateTime est = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mst = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = time.withZoneSameInstant(ZoneId.of("UTC"));

        String times = est.format(formatter) + "EST, " + mst.format(formatter) + "MST, " + utc.format(formatter) + "UTC";

        return times;
    }
}
