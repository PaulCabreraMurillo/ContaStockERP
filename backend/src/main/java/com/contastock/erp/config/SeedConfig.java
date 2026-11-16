package com.contastock.erp.config;
import com.contastock.erp.model.*;import com.contastock.erp.repo.*;import org.springframework.boot.CommandLineRunner;import org.springframework.context.annotation.*;
@Configuration public class SeedConfig {
@Bean CommandLineRunner seed(CuentaRepo cuentas){return args->{if(cuentas.count()==0){cuentas.save(new Cuenta("1.1.02","Cuentas por cobrar","ACTIVO"));cuentas.save(new Cuenta("1.1.03","Inventarios","ACTIVO"));cuentas.save(new Cuenta("2.1.01","Cuentas por pagar","PASIVO"));cuentas.save(new Cuenta("4.1.01","Ventas","INGRESO"));cuentas.save(new Cuenta("5.1.01","Costo de ventas","GASTO"));}};}
}
