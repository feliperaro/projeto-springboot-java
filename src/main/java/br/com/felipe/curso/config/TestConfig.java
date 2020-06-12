package br.com.felipe.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.felipe.curso.entities.User;
import br.com.felipe.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Marrom", "mariamarrom@gmail.com", "970707070", "123456");
		User u2 = new User(null, "Alex Verde", "alexverde@gmail.com", "40028922", "78910");

		userRepository.saveAll(Arrays.asList(u1, u2));

	}
}
