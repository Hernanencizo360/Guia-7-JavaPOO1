package geometricApp;

import entidad.Circunferencia;
import servicio.ServicioCircu;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        // Necesito conectarme al servicio por tanto creo un objeto 
        ServicioCircu circulo = new ServicioCircu();
        /* Creo un Objteo de la clase circunferencia, y lo que me devuleva la funcion
        crearCircunferencia la almaceno en el objeto cir;
         */
        Circunferencia cir = circulo.crearCircunferencia();
        circulo.area(cir);
        circulo.perimetro(cir);
    }
}
