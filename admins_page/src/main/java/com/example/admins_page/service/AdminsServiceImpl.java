package com.example.admins_page.service;

import com.example.admins_page.entity.Admins;
import com.example.admins_page.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AdminsServiceImpl implements AdminsService {
    @Autowired
    private AdminsRepository adminsRepository;
    @Override
    public String createAdmin(Admins admin) {
        adminsRepository.save(admin);
        return "Новый администратор добавлен в БД";
    }
}
