package com.wtiinfo.vendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wtiinfo.vendas.dto.SaleDTO;
import com.wtiinfo.vendas.entities.Sale;
import com.wtiinfo.vendas.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public Page<SaleDTO> findAll(Pageable pageable) {
		Page<Sale> result = repository.findAll(pageable);
		return result.map(sale -> new SaleDTO(sale));
	}
}
