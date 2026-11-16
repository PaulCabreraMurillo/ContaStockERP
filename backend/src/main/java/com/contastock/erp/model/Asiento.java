package com.contastock.erp.model;
import jakarta.persistence.*;import java.math.BigDecimal;import java.time.LocalDateTime;
@Entity @Table(name="asientos_contables") public class Asiento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
public LocalDateTime fecha=LocalDateTime.now();public String concepto;public Long documentoId;
@Column(precision=16,scale=2) public BigDecimal debe=BigDecimal.ZERO;
@Column(precision=16,scale=2) public BigDecimal haber=BigDecimal.ZERO;
}
