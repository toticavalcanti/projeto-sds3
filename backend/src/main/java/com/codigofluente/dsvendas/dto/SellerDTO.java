package com.codigofluente.dsvendas.dto;

import java.io.Serializable;

import com.codigofluente.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

  public SellerDTO() {

  }

  public SellerDTO(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public SellerDTO(Seller entity) {
    id = entity.getId();
    name = entity.getName();
  }

  private Long id;
  private String name;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
