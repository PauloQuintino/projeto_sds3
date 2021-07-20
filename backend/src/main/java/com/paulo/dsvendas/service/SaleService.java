package com.paulo.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.paulo.dsvendas.dto.SaleDTO;
import com.paulo.dsvendas.dto.SaleSuccsessDTO;
import com.paulo.dsvendas.dto.SaleSumDTO;
import com.paulo.dsvendas.entities.Sale;
import com.paulo.dsvendas.repositories.SaleRepository;
import com.paulo.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	//busca paginada de Sales
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccsessDTO> succsessGroupedBySeller(){
		return repository.successGroupedBySeller();
	}

	public int findAll() {
		return repository.findAll().size();
	}
}
