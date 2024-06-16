package com.example.admins_page.controllers;

import com.example.admins_page.entity.Admins;
import com.example.admins_page.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    private AdminsService adminsService;
    public WebController() {}
    @Autowired
    public WebController(AdminsService adminsService) {
        this.adminsService = adminsService;
    }
    @GetMapping("/")
    private String getMainPage() {
        Admins admin = new Admins("Don Corleone", "Chicho");
        adminsService.createAdmin(admin);
        return "admins_page";
    }
}
