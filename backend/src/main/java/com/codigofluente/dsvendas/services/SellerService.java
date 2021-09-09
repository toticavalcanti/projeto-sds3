package com.codigofluente.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.codigofluente.dsvendas.dto.SellerDTO;
import com.codigofluente.dsvendas.entities.Seller;
import com.codigofluente.dsvendas.repositories.SellerRepository;

@Service
public class SellerService {

  @Autowired
  private SellerRepository repository;

  public List<SellerDTO> findAll(Pageable pageable) {
    Page<Seller> result = repository.findAll(pageable);
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
  }

}
