package com.example.demo;

import com.example.demo.entity.Users;
import com.example.demo.service.SecurityService;
import com.example.demo.service.implementations.SecurityServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.UsersService;

@SpringBootApplication
public class DemoApplication {

//	@Autowired
//	private UsersService usersService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// просмотр матча
	// удаление матча
	// добавление матча
	// просмотр команды
	// вывод инф-о о пользователях
}