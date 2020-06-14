package br.com.felipe.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
