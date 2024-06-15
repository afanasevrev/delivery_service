package com.example.admins_page.controllers;

import org.springframework.stereotype.Controller;
@Controller
public class WebController {
    private String getMainPage() {
        return "admins_page";
    }
}
