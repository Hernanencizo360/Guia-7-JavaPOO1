/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que se
puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package claseDate;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();

        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();

        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        
        Date fechaUsuario = new Date(anio-1900, mes -1, dia);
        System.out.println("La fecha ingresa por el usuario es: " + fechaUsuario);

        Date fechaActual = new Date();
        System.out.println("La fecha actual es: " + fechaActual);

        

        int diferenciaAnio = fechaActual.getYear() - fechaUsuario.getYear();

        System.out.println("Hay " + diferenciaAnio + " años de diferencia entre " + anio + " y " + (fechaActual.getYear()+1900));
    }
}
