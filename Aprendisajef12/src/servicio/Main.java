
package servicio;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        PersonaServicio pS = new PersonaServicio();
        
        int anioNacimiento = pS.crearPersona();
        
        int edadP1 = pS.calcularEdad(anioNacimiento);
         
        /* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
        edad y retorna true en caso de que el receptor tenga menor edad que la persona que
        se recibe como parámetro, o false en caso contrario.*/
        
        System.out.println("Ingrese una edad, para comparar si es menor a la persona.");
        int edad = leer.nextInt();
        
        boolean resultado = pS.menorQue(edad, edadP1);
        System.out.println("El resultado de la comparacion es: " + resultado);

    }    
}
