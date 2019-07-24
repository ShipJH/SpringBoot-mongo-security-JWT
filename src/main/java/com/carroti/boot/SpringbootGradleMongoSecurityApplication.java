package com.carroti.boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.carroti.boot.models.Role;
import com.carroti.boot.repositories.RoleRepository;

@SpringBootApplication
public class SpringbootGradleMongoSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleMongoSecurityApplication.class, args);
	}

	
	@Bean
	CommandLineRunner init(RoleRepository roleRepository) {
	    return args -> {
	        Role adminRole = roleRepository.findByRole("ADMIN");
	        if (adminRole == null) {
	            Role newAdminRole = new Role();
	            newAdminRole.setRole("ADMIN");
	            roleRepository.save(newAdminRole);
	        }
	    };
	}
	
	
	
}
