package com.example.admins_page.controllers;

import com.example.admins_page.entity.Admins;
import com.example.admins_page.service.AdminsService;
import com.example.admins_page.service.AdminsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
    @Autowired
    private final AdminsService adminsService;
    public WebController(AdminsService adminsService) {
        this.adminsService = adminsService;
    }
    @GetMapping("/")
    private String getMainPage() {
        Admins admin = new Admins("Topsy Gilligan", "123qweASD");
        AdminsServiceImpl adminsServiceImpl = new AdminsServiceImpl();
        adminsServiceImpl.createAdmin(admin);
        return "admins_page";
    }
}
