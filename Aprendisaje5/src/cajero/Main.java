package cajero;

import entidad.Cuenta;
import java.util.Scanner;
import servicio.ServicioCuenta;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        ServicioCuenta sC = new ServicioCuenta();
        Cuenta obj = sC.crearCuenta();
        /*int saldoActual = obj.getSaldoActual();
        System.out.println("El saldo actual es: " + saldoActual);
        */
        // Una vez creada el objeto cuenta. Necesito llamar a mi metodo ingresarDinero.
        // Al cual le enviare el objeto y el diner para sumar al saldo actual.
        // pido el dinero a depositar 
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero a ingresar: ");
        double dinero = leer.nextDouble();
        // llamo a mi metodo ingresarDin
        
        sC.ingresarDin(dinero, obj);
        // luego puedo hacer un get del saldoActual.
        
        
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        sC.retirar(retiro, obj);
        
        sC.extraccionRapida(obj);
        
        sC.consultarSaldo(obj);
        sC.consultarDatos(obj);
    }

}
