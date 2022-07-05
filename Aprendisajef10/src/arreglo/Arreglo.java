/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20
 */
package arreglo;

import servicio.servicioArreglo;

/**
 *
 * @author Hernan
 */
public class Arreglo {

    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        // llenar vector A.
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random();
            if (i == 49) {
                System.out.println("Los elementos del Arreglo A son: ");
                for (int j = 0; j < 50; j++) {
                    System.out.println("Elemento en posicion " + j + ":" +"[" + arregloA[j] + "]");
                }
            }
        }
        System.out.println("");
       
        // llamar al servicio
        servicioArreglo obj = new servicioArreglo();
        obj.ordenarArreglo(arregloA); 
        System.out.println("");
        obj.llenarArregloB(arregloA, arregloB);
        obj.mostrarArreglo(arregloA, arregloB);

    }
}
