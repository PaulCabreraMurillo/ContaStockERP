package com.contastock.erp.model;
import jakarta.persistence.*;import java.time.LocalDateTime;
@Entity @Table(name="movimientos_inventario") public class Movimiento {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
public LocalDateTime fecha=LocalDateTime.now();
public Long productoId;public String productoNombre;public String tipo;public Integer cantidad;public Integer saldo;public Long documentoId;
}
