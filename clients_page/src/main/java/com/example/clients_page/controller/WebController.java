package com.example.clients_page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @GetMapping("/")
    private String getClientsPage() {
        return "clients_page";
    }
}
