package com.example.demo;
import com.example.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RequestMapping("api")
@RestController
public class MyController {

    @GetMapping(path="/current-date", produces="application/json")
    public String getCurrentDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String cd = dtf.format(now);

        return cd;
    }

    @RequestMapping("/welcome")
    public String welkom (@RequestParam(name="name", required=true) String name) {
        return "Welkom " + name;
    }
}
