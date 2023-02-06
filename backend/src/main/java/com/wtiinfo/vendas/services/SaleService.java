package com.wtiinfo.vendas.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wtiinfo.vendas.dto.SaleDTO;
import com.wtiinfo.vendas.entities.Sale;
import com.wtiinfo.vendas.repositories.SaleRepository;
import com.wtiinfo.vendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepo;
	
	@Transactional(readOnly = true) //para garantir que não fazer loking de escrita no banco
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepo.findAll();//trazendo para o cache evitando a reconsulta no banco. solucao simples, menos indicada
		Page<Sale> result = repository.findAll(pageable);
		return result.map(sale -> new SaleDTO(sale));
	}
}
