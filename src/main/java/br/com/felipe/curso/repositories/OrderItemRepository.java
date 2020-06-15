package br.com.felipe.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.felipe.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
