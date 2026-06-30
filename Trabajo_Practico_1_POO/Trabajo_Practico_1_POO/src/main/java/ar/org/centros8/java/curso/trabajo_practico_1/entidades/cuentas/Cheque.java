package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor 

public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fechaDePago;
}


