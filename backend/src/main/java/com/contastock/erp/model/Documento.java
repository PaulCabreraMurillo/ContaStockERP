package com.contastock.erp.model;
import jakarta.persistence.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Entity @Table(name="documentos") public class Documento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
@Column(nullable=false) public String tipo;
@Column(nullable=false) public LocalDateTime fecha=LocalDateTime.now();
public Long terceroId; public String terceroNombre;
@Column(nullable=false,precision=16,scale=2) public BigDecimal total=BigDecimal.ZERO;
@Column(nullable=false,precision=16,scale=2) public BigDecimal costoTotal=BigDecimal.ZERO;
public String observacion;
}
