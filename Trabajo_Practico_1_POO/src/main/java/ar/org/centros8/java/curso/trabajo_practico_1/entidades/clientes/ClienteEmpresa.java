package ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClienteEmpresa extends Cliente {

    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int nroDeCliente, String nombreFantasia, String cuit) {
        super(nroDeCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

}
