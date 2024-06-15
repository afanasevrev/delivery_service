package com.example.admins_page;

import com.example.admins_page.entity.Admins;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminsPageApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminsPageApplication.class, args);
		Admins admins = new Admins();
	}
}
