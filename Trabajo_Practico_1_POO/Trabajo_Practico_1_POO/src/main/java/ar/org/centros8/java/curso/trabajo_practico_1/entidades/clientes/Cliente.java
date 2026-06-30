package ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public abstract class Cliente{
    private int nroDeCliente;

    public abstract void saludar (); 
}
