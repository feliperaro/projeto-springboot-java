package br.com.felipe.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
