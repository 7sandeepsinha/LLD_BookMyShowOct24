package dev.sandeep.BookMyShowOct24.controller;

import dev.sandeep.BookMyShowOct24.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/hello")
    public ResponseEntity hello(){
        return ResponseEntity.ok("Hello World");
    }
}
