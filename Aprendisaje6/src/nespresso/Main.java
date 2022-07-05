/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese la cantidad máxima (en mL), que tendrá la cafetera.");
        int capacidadMaxima = leer.nextInt();
        
        System.out.println("Ingrese la cantidad actual de café (en mL), que posee actualmente la cafetera. ");
        int capacidadActual = leer.nextInt();
        
        Cafetera obj = new Cafetera(capacidadMaxima, capacidadActual);
        
        obj.llenarCafetera(obj);
        
        System.out.println("Ingrese el tamaño de su taza(en mL): ");
        int tamañoTaza = leer.nextInt();
        obj.servirTaza(tamañoTaza, obj);
        obj.vaciarCafetera(obj);
        
        System.out.println("Ingrese la cantidad (en mL) de café, que desea agregar: ");
        int cantidadDeCafe = leer.nextInt();
        obj.agregarCafe(cantidadDeCafe, obj);
   
    } 
}
