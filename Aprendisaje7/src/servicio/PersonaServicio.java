/*
    Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
    usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    Persona.
 */
package servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PersonaServicio {

    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        leer.nextLine();

        boolean bandera = true;
        String sexo = "A";
        
        do {
            System.out.println("Ingrese el sexo: ");
            System.out.println("M. Para masculino");
            System.out.println("F. para femenino");
            System.out.println("O. Otro");
            String sexoA = leer.nextLine();

            if (sexoA.equalsIgnoreCase("M") || sexoA.equalsIgnoreCase("F") || sexoA.equalsIgnoreCase("O")) {
                sexo = sexoA;
                bandera = false;
            } else {
                System.out.println("El sexo no es correcto");
            }
        } while (bandera);

        System.out.println("Ingrese el peso (en Kg): ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese la altura en mts: ");
        double altura = leer.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        System.out.println("Se ha creado la persona ");
        System.out.println(p1.toString());
        
        return p1;
    }

    /*
    Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
    kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
    que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
    fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
    está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
    fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
    función devuelve un 1. 
     */
    public int calcularIMC(Persona p1) {
        double peso, altura;
        int resultado;
        peso = p1.getPeso();
        altura = p1.getAltura();

        double imc = peso / Math.pow(altura, 2);
        System.out.println("El IMC es: " + imc);
        
        if (imc < 20) {
            resultado = -1;    
        } else if (imc >= 20 && imc <= 25) {
            resultado = 0;    
        } else {
            resultado = 1;
        }
        
        return resultado;
    }
   
    //• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean esMayorDeEdad(Persona p1){
        
        boolean mayorEdad;
        mayorEdad = p1.getEdad() >= 18;
        return mayorEdad;
    }
}
