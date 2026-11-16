package com.contastock.erp.model;
import jakarta.persistence.*;import java.math.BigDecimal;
@Entity @Table(name="productos") public class Producto {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
@Column(nullable=false,unique=true) public String codigo;
@Column(nullable=false) public String nombre;
public String categoria="General";
@Column(precision=16,scale=2,nullable=false) public BigDecimal costo=BigDecimal.ZERO;
@Column(precision=16,scale=2,nullable=false) public BigDecimal precio=BigDecimal.ZERO;
@Column(nullable=false) public Integer stock=0;
@Column(nullable=false) public Integer stockMinimo=5;
public boolean activo=true;
}
