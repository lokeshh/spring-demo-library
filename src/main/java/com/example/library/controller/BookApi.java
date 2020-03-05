package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookApi {

    @GetMapping("/book")
    public String getAllBooks() {
//        Restarter.getInstance().restart();
        return "oooooooooo";
    }

}
