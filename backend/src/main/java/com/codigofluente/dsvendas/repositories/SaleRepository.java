package com.codigofluente.dsvendas.repositories;

import java.util.List;

import com.codigofluente.dsvendas.dto.SaleSuccessDTO;
import com.codigofluente.dsvendas.dto.SaleSumDTO;
import com.codigofluente.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

  @Query("SELECT new com.codigofluente.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
      + " FROM Sale AS obj GROUP BY obj.seller")
  List<SaleSumDTO> amountGroupedBySeller();

  @Query("SELECT new com.codigofluente.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
      + " FROM Sale AS obj GROUP BY obj.seller")
  List<SaleSuccessDTO> successGroupedBySeller();
}
