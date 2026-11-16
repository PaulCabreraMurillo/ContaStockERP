package com.contastock.erp.model;
import jakarta.persistence.*;
@Entity @Table(name="terceros") public class Tercero {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
@Column(nullable=false) public String nombre;
@Column(nullable=false) public String tipo;
public String identificacion; public String correo; public String telefono;
}
