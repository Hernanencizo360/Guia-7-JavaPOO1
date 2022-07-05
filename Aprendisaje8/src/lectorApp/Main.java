
package lectorApp;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        int longitud; 
        
        Cadena obj1 = new Cadena();
        
        System.out.println("Ingrese la frase.");
        frase = leer.nextLine();
        longitud = frase.length(); 
        
        
        obj1.setFrase(frase);
        obj1.setLongitud(longitud);
        
        CadenaServicio sC = new CadenaServicio();
        
        sC.mostrarVocales(obj1);
        sC.invertirFrase(obj1);
        
        System.out.println("Ingrese un caracter para buscar en la frase: ");
        String caracter = leer.next().substring(0,1);
       
        sC.vecesRepetido(caracter, obj1);
        leer.nextLine();
        
        System.out.println("Ingrese una nueva frase para comparar longitudes.");
        String fraseNueva = leer.nextLine();
        sC.compararLongitud(fraseNueva, obj1);
        
        System.out.println("Ingrese una frase para concatenar a la original: ");
        String concatenar = leer.nextLine();
        
        sC.unirFrases(concatenar, obj1);

        System.out.println("Ingrese el caracter que remplazará a la letra 'a'");
        String letra = leer.nextLine().substring(0,1);
        
        sC.reemplazar(letra, obj1);
        
        System.out.println("Ingrese una letra para comprobar si la frase la contiene: ");
        String letraBuscar = leer.nextLine().substring(0,1);
        
        System.out.println("El resultado de la busqueda es: "+sC.contiene(letraBuscar, obj1));
        
    }
    
}
