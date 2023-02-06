package com.wtiinfo.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wtiinfo.vendas.dto.SellerDTO;
import com.wtiinfo.vendas.entities.Seller;
import com.wtiinfo.vendas.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(seller -> new SellerDTO(seller)).collect(Collectors.toList());
	}
}
