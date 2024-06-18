package com.example.admins_page;

import com.example.admins_page.entity.AdminsEntity;
import com.example.admins_page.service.AdminsService;
import com.example.admins_page.service.AdminsServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/**
 * Точка запуска приложения
 */
@SpringBootApplication
public class AdminsPageApplication {
	@Bean
	public AdminsService adminsService() {
		return new AdminsServiceImpl();
	}
	public static void main(String[] args) {
		SpringApplication.run(AdminsPageApplication.class, args);
		AdminsEntity admins = new AdminsEntity();
	}
}
