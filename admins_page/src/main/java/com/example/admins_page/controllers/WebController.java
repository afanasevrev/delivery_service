package com.example.admins_page.controllers;

import com.example.admins_page.service.AdminsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
/**
 * Контроллер - отвечает на запросы от клиентов
 */
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
        return "admins_page";
    }
    @GetMapping("/delete/{id}")
    private String deleteAdmin(@PathVariable Long id) {
        adminsService.deleteAdmin(id);
        return "admins_page";
    }
}
