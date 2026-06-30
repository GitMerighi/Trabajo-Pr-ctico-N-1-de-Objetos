package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {
    private double giroEnDescubierto;

    public CuentaCorriente(int nroDeCuenta, Cliente clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado);
        this.giroEnDescubierto = giroEnDescubierto;
    }

    @Override
    /**
     * Este metodo se encarga de depositar dinero en la cuenta corriente.
     * 
     * @param monto -> Monto a depositar.
     */
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    /**
     * Este metodo se encarga de extraer dinero de la cuenta corriente.
     * Si no se llega con el saldo, ahi se retira por giroDescubierto con un
     * tope en el descubierto
     * 
     * @param monto -> Monto a extraer.
     */
    public void extraer(double monto) {
        if (getSaldo() - monto >= -giroEnDescubierto) {
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Supera el límite de descubierto");
        }
    }

    /**
     * Método depositar cheque
     * Primero crear el cheque y luego usar el metodo.
     * @param cheque -> Cheque a depositar.
     */
    public void depositarCheque(Cheque cheque) {
        setSaldo(getSaldo() + cheque.getMonto());
    }
}
