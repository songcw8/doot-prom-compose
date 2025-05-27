package org.example.dootpromcompose.controller;

import io.micrometer.core.annotation.Counted;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountedController {

    @Counted(value = "give_me_money", description = "돈 내놔")
    @GetMapping("/counted")
    public String getCounted(){
        return "Counted OK";
    }

    @GetMapping("/error")
    public ResponseEntity<Void> getError(){
        return ResponseEntity.status(500).build();
    }
}
