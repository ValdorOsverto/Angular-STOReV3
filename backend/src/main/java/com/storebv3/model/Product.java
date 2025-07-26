package com.storebv3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String producto;
  private int codigobarras;
  private String marca;
  private double costo;
  private String estatus;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public String getProducto() { return producto; }
  public void setProducto(String producto) { this.producto = producto; }
  public int getCodigobarras() { return codigobarras; }
  public void setCodigobarras(int codigobarras) { this.codigobarras = codigobarras; }
  public String getMarca() { return marca; }
  public void setMarca(String marca) { this.marca = marca; }
  public double getCosto() { return costo; }
  public void setCosto(double costo) { this.costo = costo; }
  public String getEstatus() { return estatus; }
  public void setEstatus(String estatus) { this.estatus = estatus; }
}

  public String getEstatus() {
    return estatus;
  }

  public void setEstatus(String estatus) {
    this.estatus = estatus;
  }
}