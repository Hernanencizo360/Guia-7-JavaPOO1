//Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto.
package servicio;

import entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PuntoServicio {

    public Puntos crearPuntos() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el número de la coordenada 'x1': ");
        double x1 = leer.nextDouble();
        System.out.println("Ingrese el número de la coordenada 'y1': ");
        double y1 = leer.nextDouble();

        System.out.println("Ingrese el número de la coordenada 'x2': ");
        double x2 = leer.nextDouble();
        System.out.println("Ingrese el número de la coordenada 'y2': ");
        double y2 = leer.nextDouble();
        
        Puntos obj = new Puntos(x1, y1, x2, y2);
        return obj; 
    }
    
    //Después, a través de otro método calcular y devolver la distancia
    //que existe entre los dos puntos que existen en la clase Puntos. 
    
    public double calcularDistancia(Puntos obj){
     
        // formula ---->   d=√((x2-x1)²+(y2-y1)²) 
        double x1 = obj.getX1();
        double y1 = obj.getY1();
        
        double x2 = obj.getX2();
        double y2 = obj.getY2();
        
        double sumaCuadrado = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        
        double distancia = Math.sqrt(sumaCuadrado);
        return distancia;
    }
}
