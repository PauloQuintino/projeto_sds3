package com.paulo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
