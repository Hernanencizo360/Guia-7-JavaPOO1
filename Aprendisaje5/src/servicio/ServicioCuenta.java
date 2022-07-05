package servicio;

import entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class ServicioCuenta {

    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Cuenta crearCuenta() {
        Scanner leer = new Scanner(System.in);

        int numeroCuenta, saldoActual, interes;
        long dniCliente;

        System.out.println("Ingrese su numero de Cuenta: ");
        numeroCuenta = leer.nextInt();

        System.out.println("Ingrese su DNI: ");
        dniCliente = leer.nextLong();

        System.out.println("Ingrese su Saldo: ");
        saldoActual = leer.nextInt();

        System.out.println("Ingrese su Interes: ");
        interes = leer.nextInt();

        Cuenta obj = new Cuenta(numeroCuenta, dniCliente, saldoActual, interes);
        System.out.println("Se ha creado la cuenta.");
        System.out.println("--------------------------------------------------------");
        return obj;
    }

    /*  Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    y se la sumara a saldo actual.*/
    public Cuenta ingresarDin(double ingreso, Cuenta obj) {

        int dinero = (obj.getSaldoActual() + (int) ingreso);

        obj.setSaldoActual(dinero);

        System.out.println("Ingreso el Dinero de manera satisfactoria.");
        System.out.println("Su saldo actual es: $" + obj.getSaldoActual());
        System.out.println("--------------------------------------------------------");
        return obj;
    }

    /*  Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
        restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
        saldo actual en 0. 
     */
    public void retirar(double retiro, Cuenta obj) {
        int saldoActual = obj.getSaldoActual();
        int actualizarSaldo = (saldoActual - (int) retiro);

        obj.setSaldoActual(actualizarSaldo);
        System.out.println("Su saldo actual es: $" + obj.getSaldoActual());
        System.out.println("--------------------------------------------------------");
    }

    /*  Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
        usuario no saque más del 20%.
     */
    public void extraccionRapida(Cuenta obj) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dinero para la Extraccion Rapida: ");
        int dineroExtraccion = leer.nextInt();

        int saldoActual = obj.getSaldoActual();
        int porcentaje = (dineroExtraccion * 100) / saldoActual;

        if (porcentaje > 20) {
            System.out.println("Sólo puede retirar 20% de su Saldo...");
            System.out.println(obj.getSaldoActual());
        } else {
            int saldoEnCuenta = obj.getSaldoActual();
            obj.setSaldoActual(saldoEnCuenta - dineroExtraccion);
            System.out.println("¡Extraccion hecha!");
            System.out.println("Su saldo actual es: " + obj.getSaldoActual());
        }
        System.out.println("--------------------------------------------------------");
    }

    //Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta. 
    public void consultarSaldo(Cuenta obj) {
        System.out.println("Eligio consultar su saldo.....");
        System.out.println("Su saldo actual es: " + obj.getSaldoActual());
        System.out.println("--------------------------------------------------------");
    }

    //Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void consultarDatos(Cuenta obj) {
        System.out.println(obj.toString());
        System.out.println("--------------------------------------------------------");
    }

}
