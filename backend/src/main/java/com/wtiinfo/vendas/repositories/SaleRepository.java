package com.wtiinfo.vendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wtiinfo.vendas.dto.SaleSumDTO;
import com.wtiinfo.vendas.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

	@Query("SELECT new com.wtiinfo.vendas.dto.SaleSumDTO(s.seller, SUM(s.amount)) "
			+ "FROM Sale AS s GROUP BY s.seller")
	List<SaleSumDTO> amountGroupedBySeller();
}
