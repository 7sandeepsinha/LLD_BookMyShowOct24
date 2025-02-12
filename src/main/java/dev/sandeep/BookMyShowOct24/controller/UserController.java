package dev.sandeep.BookMyShowOct24.controller;

import dev.sandeep.BookMyShowOct24.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity getUserById(@PathVariable int id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

}
