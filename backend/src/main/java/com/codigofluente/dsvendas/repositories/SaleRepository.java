package com.codigofluente.dsvendas.repositories;

import com.codigofluente.dsvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
