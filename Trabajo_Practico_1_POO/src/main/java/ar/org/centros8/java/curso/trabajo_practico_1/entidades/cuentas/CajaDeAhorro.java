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
 
    @Override
public void extraer(double monto) {
    // Validación: no se puede extraer más de lo que hay en la cuenta
    if (monto <= 0) {
        System.out.println("El monto a extraer debe ser mayor a cero.");
        return;
    }
    if (monto > getSaldo()) {
        System.out.println("Saldo insuficiente. No se puede realizar la extracción.");
        return;
    }
    setSaldo(getSaldo() - monto);
    System.out.println("Extracción exitosa. Nuevo saldo: " + getSaldo());
}

    // Método para cobrar intereses
    public void cobrarInteres() {
        setSaldo (getSaldo() + ((getSaldo() * getTasaDeInteres())/100));
        System.out.println("Se ha cobrado el interes correspondiente a la caja de ahorro, el nuevo saldo es: " + getSaldo());
    }
}
