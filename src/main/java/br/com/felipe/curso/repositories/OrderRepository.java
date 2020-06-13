package br.com.felipe.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
