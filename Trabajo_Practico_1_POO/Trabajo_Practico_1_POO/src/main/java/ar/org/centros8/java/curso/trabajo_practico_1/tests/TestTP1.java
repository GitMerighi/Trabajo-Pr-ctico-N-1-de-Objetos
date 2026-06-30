package ar.org.centros8.java.curso.trabajo_practico_1.tests;

import java.time.LocalDate;

import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.Cliente;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteEmpresa;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.clientes.ClienteIndividual;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CajaDeAhorro;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.Cheque;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.Cuenta;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaConvertibilidad;
import ar.org.centros8.java.curso.trabajo_practico_1.entidades.cuentas.CuentaCorriente;

public class TestTP1 {
    public static void main(String[] args) {
        System.out.println("######################Test de la clase ClienteIndividual######################");

        Cliente clienteIndividual1 = new ClienteIndividual(1, "Alan", "Brado", "33944177");
        System.out.println(clienteIndividual1);
        clienteIndividual1.saludar();
        System.out.println("****ClienteIndividual funcionando*****");
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase ClienteEmpresa######################");   
        ClienteEmpresa clienteEmpresa1 = new ClienteEmpresa(101, "Financiera Franciasco", "27-40157963-3");
        System.out.println(clienteEmpresa1);
        clienteEmpresa1.saludar();
        System.out.println("****ClienteEmpresa funcionando*****");        
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase CajaDeAhorro######################");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(10, clienteIndividual1, 5);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.depositar(100000);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.extraer(50000);
        System.out.println(cajaDeAhorro1);
        cajaDeAhorro1.cobrarInteres();
        System.out.println("****CajaDeAhorro funcionando*****");

        System.out.println();        
        System.out.println();

        System.out.println("######################Test de la clase CuentaCorriente######################");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(102, clienteEmpresa1, 10000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.depositar(100000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(105000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(10000);
        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);
        Cheque cheque1 = new Cheque(10000, "Galicia", LocalDate.of(2026, 04, 27));
        cuentaCorriente1.depositarCheque(cheque1);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.depositar(14000);
        System.out.println(cuentaCorriente1);
        System.out.println("****CuentaCorriente funcionando*****");
        System.out.println();
        System.out.println();

        System.out.println("######################Test de la clase cuentaConvertibilidad######################");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(1, clienteEmpresa1, 0);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.depositarDolares(100);
        System.out.println(cuentaConvertibilidad1);
        cuentaConvertibilidad1.extraerDolares(50);
        System.out.println(cuentaConvertibilidad1);
        System.out.println();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        ClienteIndividual cliente1 = new ClienteIndividual(101, "Rumi", "Horimiya", "23819074");
        System.out.println(cliente1);
        cliente1.saludar();

        ClienteIndividual cliente2 = new ClienteIndividual(140, "Ricardo", "Arjona", "43944177");
        System.out.println(cliente2);
        cliente2.saludar();
        System.out.println("######################Clase ClienteIndividual funciona correctamente######################\n");

        System.out.println("######################Test de la clase ClienteEmpresa######################");
        ClienteEmpresa empresa1 = new ClienteEmpresa(789, "Francisco SRL", "30-23123467-4");
        System.out.println(empresa1);
        empresa1.saludar();

        ClienteEmpresa empresa2 = new ClienteEmpresa(123, "System Republic", "30-45678904-4");
        System.out.println(empresa2);
        empresa2.saludar();
        System.out.println("######################Clase ClienteEmpresa funciona correctamente######################\n");

        System.out.println("######################Test de la clase CajaDeAhorro######################");
        CajaDeAhorro cajaDeAhorro1 = new CajaDeAhorro(89, cliente2, 3);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.depositar(100000);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.extraer(100000);
        System.out.println(cajaDeAhorro1);

        cajaDeAhorro1.cobrarInteres();
        System.out.println("######################Clase CajaDeAhorro funciona correctamente######################\n");

        // System.out.println("######################Test de la clase
        // Cheque######################");
        // Cheque cheque1 = new Cheque(50000, "Banco Galicia", LocalDate.of(2026, 12,
        // 31));
        // System.out.println(cheque1);

        // Cheque cheque2 = new Cheque(100000, "Banco Santander", LocalDate.of(2026, 8,
        // 25));
        // System.out.println(cheque2);
        // System.out.println("######################Clase Cheque funciona
        // correctamente######################\n");

        System.out.println("######################Test de la clase CuentaCorriente######################");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(123, cliente2, 9000);
        System.out.println(cuentaCorriente1);

        cuentaCorriente1.depositar(100000);
        System.out.println(cuentaCorriente1);

        cuentaCorriente1.extraer(105000);
        System.out.println(cuentaCorriente1);
        cuentaCorriente1.extraer(5000);
        // System.out.println(cuentaCorriente1);

        cuentaCorriente1.depositarCheque(new Cheque(60000, "Banco Galicia", LocalDate.of(2026, 9, 15)));
        System.out.println(cuentaCorriente1);

        cuentaCorriente1.extraer(5000);
        System.out.println(cuentaCorriente1);
        System.out.println("######################Clase CuentaCorriente funciona correctamente######################\n");

        System.out.println("######################Test de la clase CuentaConvertibilidad######################");
        CuentaConvertibilidad cuentaConvertibilidad1 = new CuentaConvertibilidad(12, empresa2, 1000);
        System.out.println(cuentaConvertibilidad1);

        CuentaConvertibilidad cuentaConvertibilidad2 = new CuentaConvertibilidad(789,
        new ClienteEmpresa(333, "Acer", "20-88553355-2"), 1000);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.depositar(5000);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.extraer(1200000);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.convertirADolares(5000);
        System.out.println(cuentaConvertibilidad2);
        cuentaConvertibilidad2.convertirADolares(50000);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.convertirAPesos(10);
        System.out.println(cuentaConvertibilidad2);
        cuentaConvertibilidad2.convertirAPesos(100);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.depositarDolares(100);
        System.out.println(cuentaConvertibilidad2);
        System.out.println();

        cuentaConvertibilidad2.extraerDolares(9.28);
        System.out.println(cuentaConvertibilidad2);
        cuentaConvertibilidad2.extraerDolares(130);
        System.out.println(cuentaConvertibilidad2);*/

    }

}
