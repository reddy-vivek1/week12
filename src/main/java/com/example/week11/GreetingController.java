package com.example.week11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    @GetMapping("/Double")
    public int doubleTheNumber(@RequestParam(value = "number") int number){
        return number*2;
    }
}
