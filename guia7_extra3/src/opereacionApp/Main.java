
package opereacionApp;

import entidad.Raices;

/**
 *
 * @author Hernan
 */
public class Main {
    
    public static void main(String[] args) {
       // Nota: (Ecuacion con 2 resultados conocidos: a=1, b=-5, c=6 ---> x0 = 3 y x1 = 2)
       //********* Ecuacion con 1 resultado conocido: a=1, b=-2, c=1 ---> x0 = 1
       //Ecuacion sin solucion (cuando el discriminante es negativo)Ej: a=1, b=0, c=3 
    
        Raices ob = new Raices(1, -2, 1);
        
        //Método getDiscriminante(): devuelve el valor del discriminante (double).
        System.out.println("El valor del discriminate es: " + ob.getDiscriminante());
        System.out.println("---------------------------------------------");
        
        //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones
        System.out.println("¿La ecuación tiene dos soluciones posibles?");
        System.out.println("Respuesta: " + ob.tieneRaices(ob));
        System.out.println("---------------------------------------------");
        
        //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución
        System.out.println("¿La ecuación tiene una única solucion posible?");
        System.out.println("Respuesta: " + ob.tieneRaiz(ob.getDiscriminante()));
        System.out.println("---------------------------------------------");
        
        //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
        //soluciones. 
        ob.obtenerRaices(ob);
        
        ob.calcular(ob);
    }
    
}
