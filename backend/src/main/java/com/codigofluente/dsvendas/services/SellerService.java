package com.codigofluente.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;

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

  public List<SellerDTO> findAll() {
    List<Seller> result = repository.findAll();
    return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
  }
}
