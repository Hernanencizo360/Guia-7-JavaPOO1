
package calculadorDistancia;

import entidad.Puntos;
import servicio.PuntoServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        
        PuntoServicio pS = new PuntoServicio();
        Puntos obj = pS.crearPuntos();
        
        // calcular distancia y mostrar distancia 
        System.out.println("La distancia entre ambos puntos es: " + pS.calcularDistancia(obj));   
    } 
}
