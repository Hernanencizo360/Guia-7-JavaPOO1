/*
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 */
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PersonaServicio {
    
    public int crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre de la Persona: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese el dia de nacimiento de la persona: ");
        int dia = leer.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = leer.nextInt();
        
        System.out.println("Ingrese el año de nacimiento de la persona: ");
        int anio = leer.nextInt();
        
        Date fechaDeNacimiento = new Date(anio -1900, mes -1, dia);
        
        p1.setFechaDeNacimiento(fechaDeNacimiento);
        p1.setNombre(nombre);
        
        System.out.println(p1.toString());
        return anio;
    }
    
    /* • Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.
    */
    
    public int calcularEdad(int anio){
        Date hoy = new Date();
        
        int edad = (hoy.getYear()+1900) - anio ;
        System.out.println("La edad de la persona es: " + edad); 
 
        return edad;
    }
    
    /* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.*/
    
    public boolean menorQue(int edad, int edadP1){  
        return edadP1 >= edad; 
    }
}
