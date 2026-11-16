package com.contastock.erp.model;
import jakarta.persistence.*;import java.math.BigDecimal;
@Entity @Table(name="lineas_asiento") public class LineaAsiento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
public Long asientoId;public String cuentaCodigo;public String cuentaNombre;
@Column(precision=16,scale=2) public BigDecimal debe=BigDecimal.ZERO;
@Column(precision=16,scale=2) public BigDecimal haber=BigDecimal.ZERO;
}
