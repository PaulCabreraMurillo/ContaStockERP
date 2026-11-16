package com.contastock.erp.model;
import jakarta.persistence.*;import java.math.BigDecimal;
@Entity @Table(name="detalles_documento") public class DetalleDocumento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
@Column(nullable=false) public Long documentoId;
@Column(nullable=false) public Long productoId;
public String productoNombre;
@Column(nullable=false) public Integer cantidad;
@Column(precision=16,scale=2) public BigDecimal precioUnitario;
@Column(precision=16,scale=2) public BigDecimal subtotal;
}
