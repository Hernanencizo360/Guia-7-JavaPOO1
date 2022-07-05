package servicio;

import java.util.Arrays;

/**
 *
 * @author Hernan
 */
public class servicioArreglo {

    // metodo para ordenar el arregloA de menor a mayor. Nota: Arrays.sort(arreglo). Este método sirve para ordenar 
    //un arreglo de manera ascendente.
    public void ordenarArreglo(double[] arregloA) {
        System.out.println("Los numeros del arreglo A ordenados de menor a mayor son: ");
        // ordenar de menor a mayor. 
        Arrays.sort(arregloA);
        for (int i = 0; i < 50; i++) {
            System.out.print("[" + arregloA[i] + "]");
        }
    }

    //metodo para llenar el arregloB con los 10 primeros numeros del arregloA y los ultimos 10 con 0.5
    // Arrays.fill(arreglo, int desde, int hasta, variable)
    // Este método lo que hace es inicializar todo el arreglo con la variable o valor que pasamos como argumento. Este método
    // se puede usar con cualquier tipo de dato y le podemos decir desde y hasta que índice queremos que llene con ese valor
    public void llenarArregloB(double[] arregloA, double[] arregloB) {
        System.out.println("");
        int i = 0;
        while (i <= 19){
           if (i < 10){
               arregloB[i] = arregloA[i];
           } else {
                Arrays.fill(arregloB,10,20,0.5); 
           }
            i++;
        }
    }

    // metodo para mostrar el arregloB. Nota: usamos el metodo Arrays.toString. Este método imprime el arreglo como una cadena
    public void mostrarArreglo(double[] arregloA, double[] arregloB) {
        System.out.println("Elementos del Arreglo A: ");
        System.out.println(Arrays.toString(arregloA));
        
        System.out.println("");
        
        System.out.println("Elementos del Arreglo B: ");
        System.out.println(Arrays.toString(arregloB));
    }
}
