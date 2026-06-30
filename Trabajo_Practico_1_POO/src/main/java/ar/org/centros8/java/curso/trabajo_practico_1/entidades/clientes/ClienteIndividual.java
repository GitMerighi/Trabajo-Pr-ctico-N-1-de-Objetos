package ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true)

public class ClienteIndividual extends Cliente{
    private String nombre;
    private String apellido;
    private String dni;
    
    public ClienteIndividual(int nroDeCliente, String nombre, String apellido, String dni) {
        super(nroDeCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    }





