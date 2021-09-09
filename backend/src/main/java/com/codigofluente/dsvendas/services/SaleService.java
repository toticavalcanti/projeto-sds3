package com.codigofluente.dsvendas.services;

import com.codigofluente.dsvendas.dto.SaleDTO;
import com.codigofluente.dsvendas.entities.Sale;
import com.codigofluente.dsvendas.repositories.SaleRepository;
import com.codigofluente.dsvendas.repositories.SellerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SaleService {

  @Autowired
  private SaleRepository repository;

  @Autowired
  private SellerRepository sellerRepository;

  @Transactional(readOnly = true)
  public Page<SaleDTO> findAll(org.springframework.data.domain.Pageable pageable) {
    sellerRepository.findAll();
    Page<Sale> result = (Page<Sale>) repository.findAll(pageable);
    return result.map(x -> new SaleDTO(x));
  }

}
