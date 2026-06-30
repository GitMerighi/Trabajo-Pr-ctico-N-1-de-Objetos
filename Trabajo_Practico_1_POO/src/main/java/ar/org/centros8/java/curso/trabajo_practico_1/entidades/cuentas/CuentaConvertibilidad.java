package ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public final class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoEnDolares;
    private static final double PRECIO_DOLAR_COMPRA = 1470.0;  // el banco le compra dólares al cliente a este precio
private static final double PRECIO_DOLAR_VENTA  = 1500.0;  // el banco le vende dólares al cliente a este precio

    public CuentaConvertibilidad(int nroDeCuenta, ClienteEmpresa clienteAsociado, double giroEnDescubierto) {
        super(nroDeCuenta, clienteAsociado, giroEnDescubierto);
      
    }
    @Override
    public void setClienteAsociado(Cliente clienteAsociado) {
        if (clienteAsociado instanceof ClienteEmpresa) {
            super.setClienteAsociado(clienteAsociado);
        } else {
            System.out.println("Error: CuentaConvertibilidad solo admite ClienteEmpresa como titular. "
                    + "No se modificó el cliente asociado.");
        }
    }
/**
     * Convierte pesos a dólares.
     * Se usa PRECIO_DOLAR_VENTA porque el banco le *vende* los dólares al cliente.
     */
    public double convertirADolares(double monto) {
        if (monto <= getSaldo()) {
            System.out.println("Sr. Cliente la compra en dolares es solo con saldo en cuenta.");
            setSaldo(getSaldo() - monto);
            saldoEnDolares = Math.round((saldoEnDolares + (monto / PRECIO_DOLAR_VENTA)) * 100.0) / 100.0;
            return saldoEnDolares;
        } else {
            System.out.println("Saldo en pesos insuficiente para realizar la operacion");
            return saldoEnDolares;
        }
    }

    /**
     * Convierte dólares a pesos.
     * Se usa PRECIO_DOLAR_COMPRA porque el banco le *compra* los dólares al cliente.
     * 
     * @param monto -> El monto en dólares que se desea convertir a pesos.
     * @return -> El nuevo saldo en pesos después de la conversión, o el saldo en
     *         pesos sin modificar si el monto a convertir supera el saldo en
     *         dólares disponible.
     */
    public double convertirAPesos(double monto) {          //Método para convertir de pesos a dolares
                                                               
        if (monto <= saldoEnDolares) {
            saldoEnDolares = (saldoEnDolares - monto);
            setSaldo(getSaldo() + (monto * PRECIO_DOLAR_COMPRA));
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
