/*
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
 */
package servicio;

import entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class ServicioCircu {

    public Circunferencia crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio que tendrá la circunferencia: ");
        double radio = leer.nextDouble();
        Circunferencia obj = new Circunferencia(radio);
        obj.getRadio();
        return obj;
    }

    // Método area(): para calcular el área de la circunferencia
    public void area(Circunferencia obj) {
        double radio, area, pi = 3.141592654;
        radio = obj.getRadio();
        area = (pi * Math.pow(radio, 2));
        System.out.println("El area del circulo es: " + area);
    }

    //Método perimetro(): para calcular el perímetro 
    public void perimetro(Circunferencia obj) {
        double radio, perimetro, pi = 3.141592654;
        radio = obj.getRadio();
        perimetro = 2 * pi * radio;
        System.out.println("El perimetro del circulo es: "+ perimetro);
    }
}
