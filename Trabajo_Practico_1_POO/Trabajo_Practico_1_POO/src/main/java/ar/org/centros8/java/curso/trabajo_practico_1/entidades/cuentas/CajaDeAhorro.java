package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    public CajaDeAhorro(int nroDeCuenta, Cliente clienteAsociado, double tasaDeInteres) {
        super(nroDeCuenta, clienteAsociado);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override // metodo depositar
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override // metodo extraer
    public void extraer(double monto) {
        setSaldo(getSaldo() - monto);
    }

    // Método para cobrar intereses
    public void cobrarInteres() {
        setSaldo (getSaldo() + ((getSaldo() * getTasaDeInteres())/100));
        System.out.println("Se ha cobrado el interes correspondiente a la caja de ahorro, el nuevo saldo es: " + getSaldo());
    }
}
