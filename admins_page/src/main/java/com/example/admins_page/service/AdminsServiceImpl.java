package com.example.admins_page.service;

import com.example.admins_page.entity.AdminsEntity;
import com.example.admins_page.repository.AdminsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
public class AdminsServiceImpl implements AdminsService {
    @Autowired
    private AdminsRepository adminsRepository;
    @Override
    public String createAdmin(AdminsEntity admin) {
        adminsRepository.save(admin);
        return "Новый администратор добавлен в БД";
    }
    @Override
    public List<AdminsEntity> readAdmins() {
        return adminsRepository.findAll();
    }
    @Override
    public AdminsEntity readAdmin(Long id) {
        AdminsEntity admin = adminsRepository.findById(id).get();
        return admin;
    }
    @Override
    public boolean deleteAdmin(Long id) {
        if (!adminsRepository.findById(id).isEmpty()) {
            AdminsEntity admin = adminsRepository.findById(id).get();
            adminsRepository.delete(admin);
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String updateAdmin(AdminsEntity admin, Long id) {
        AdminsEntity adminsEntity = adminsRepository.findById(id).get();
        adminsEntity.setLogin(admin.getLogin());
        adminsEntity.setPassword(admin.getPassword());
        adminsRepository.save(adminsEntity);
        return "Успешно обновлено";
    }
}
