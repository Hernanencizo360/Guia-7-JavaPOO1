/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioLibro;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class ServicioLibro {

    public Libro cargarLibro() {

        Scanner leer = new Scanner(System.in);
        // pido los datos 
        System.out.println("Inserte el número de ISBN: ");
        int ISBN = leer.nextInt();

        System.out.println("Inserte el número de Páginas: ");
        int NumeroDePaginas = leer.nextInt();

        leer.nextLine();

        System.out.println("Inserte el Título: ");
        String Título = leer.nextLine();

        System.out.println("Inserte el Autor: ");
        String Autor = leer.nextLine();

        // llamo a mi metodo constructor
        return new Libro(Título, Autor, ISBN, NumeroDePaginas);
    }
}
