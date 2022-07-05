/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class servicioOperacion {

    public Operacion crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        double numero1 = leer.nextDouble();
        System.out.println("Ingrese el segundo número");
        double numero2 = leer.nextDouble();
        Operacion op = new Operacion(numero1, numero2);
        return op;
    }

    // Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public void sumar(Operacion obj) {
        double numero1 = obj.getNumero1();
        double numero2 = obj.getNumero2();
        double suma = numero1 + numero2;
        System.out.println("La suma es: " + suma);
    }

    // Método restar(): calcular la resta de los números y devolver el resultado al main.
    public void restar(Operacion obj) {
        double numero1 = obj.getNumero1();
        double numero2 = obj.getNumero2();
        double resta = numero1 - numero2;
        System.out.println("La resta es: " + resta);
    }

    /* 
    * Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
    * no, se hace la multiplicación y se devuelve el resultado al main
     */
    public void multiplicar(Operacion obj) {
        double numero1 = obj.getNumero1();
        double numero2 = obj.getNumero2();
        double multiplicacion;

        if ((numero1 == 0) || (numero2 == 0)) {
            System.out.println("No se puede multiplicar por 0 'cero'.");
        } else {
            System.out.println("El resultado de la multipilicacion es: " + (multiplicacion = numero1 * numero2));
        }
    }

    /* 
    *   Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    *   una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    *   informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
     */
    public void dividir(Operacion obj) {
        double numero1 = obj.getNumero1();
        double numero2 = obj.getNumero2();
        double division;

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede dividir por 0 'cero'.");
        } else {
            division = numero1 / numero2;
            System.out.println("El resultado de la division es: " + (division = numero1 / numero2));
        }
    }
}
