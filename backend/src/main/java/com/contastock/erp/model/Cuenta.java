package com.contastock.erp.model;
import jakarta.persistence.*;
@Entity @Table(name="cuentas_contables") public class Cuenta {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) public Long id;
@Column(nullable=false,unique=true) public String codigo;
@Column(nullable=false) public String nombre;
@Column(nullable=false) public String tipo;
public Cuenta(){} public Cuenta(String c,String n,String t){codigo=c;nombre=n;tipo=t;}
}
