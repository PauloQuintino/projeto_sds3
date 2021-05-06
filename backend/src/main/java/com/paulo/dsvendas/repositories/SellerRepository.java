package com.paulo.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
