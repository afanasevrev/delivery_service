package com.example.admins_page.repository;

import com.example.admins_page.entity.AdminsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AdminsRepository extends JpaRepository<AdminsEntity, Long> {}
