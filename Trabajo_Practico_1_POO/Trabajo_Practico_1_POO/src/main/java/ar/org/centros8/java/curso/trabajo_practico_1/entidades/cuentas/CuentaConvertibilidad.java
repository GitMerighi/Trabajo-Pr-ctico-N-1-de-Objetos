package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoEnDolares;
    private double precioDolar;

    public CuentaConvertibilidad(int nroDeCuenta, ClienteEmpresa clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado, giroEnDescubierto);
        this.saldoEnDolares = 0.0;
        this.precioDolar = 1400.00;
    }

    public double convertirADolares(double monto) {
        if (monto <= getSaldo()) {
            System.out.println("Sr. Cliente la compra en dolares es solo con saldo en cuenta.");
            setSaldo(getSaldo() - monto);
            saldoEnDolares = Math.round((saldoEnDolares + (monto / precioDolar)) * 100.0) / 100.0;
            return saldoEnDolares;
        } else {
            System.out.println("Saldo en pesos insuficiente para realizar la operacion");
            return saldoEnDolares;
        }
    }

    /**
     * Convierte un monto de dólares a pesos, siempre y cuando el monto a convertir
     * no supere el saldo en dólares disponible.
     * 
     * @param monto -> El monto en dólares que se desea convertir a pesos.
     * @return -> El nuevo saldo en pesos después de la conversión, o el saldo en
     *         pesos sin modificar si el monto a convertir supera el saldo en
     *         dólares disponible.
     */
    public double convertirAPesos(double monto) {
        if (monto <= saldoEnDolares) {
            saldoEnDolares = (saldoEnDolares - monto);
            setSaldo(getSaldo() + (monto * precioDolar));
            return getSaldo();
        } else {
            System.out.println("Saldo en dolares insuficiente para realizar la operacion");
            return getSaldo();
        }
    }


    // Méto para depositar dolares
    public void depositarDolares(double monto) {
        saldoEnDolares = saldoEnDolares + monto;
    }

    // metodo extracion dolares, siempre y cuando haya saldoDolar positivo.
    public void extraerDolares(double monto) {
        if (saldoEnDolares >= monto) {
            saldoEnDolares = saldoEnDolares - monto;
        } else {
            System.out.println("Saldo en dolares Insuficiente");
        }
    }
}
