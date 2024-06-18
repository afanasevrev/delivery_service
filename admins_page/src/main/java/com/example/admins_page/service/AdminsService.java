package com.example.admins_page.service;

import com.example.admins_page.entity.AdminsEntity;
import java.util.List;
public interface AdminsService {
    String createAdmin(AdminsEntity admin);
    List<AdminsEntity> readAdmins();
    AdminsEntity readAdmin(Long id);
    boolean deleteAdmin(Long id);
    String updateAdmin(AdminsEntity admin, Long id);
}
