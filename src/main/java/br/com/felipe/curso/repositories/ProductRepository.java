package br.com.felipe.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
