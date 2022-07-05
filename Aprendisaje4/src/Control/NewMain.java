
package Control;

import Aprendisaje4.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int Base, Altura;
        
        System.out.println("Ingrese la altura del rectangulo: ");
        Base = leer.nextInt();
        System.out.println("Ingrese la base del rectangulo: ");
        Altura = leer.nextInt();
        
        Rectangulo rec = new Rectangulo(Base, Altura);

        rec.crearRectangulo();
        rec.calcularSuperficie();
        rec.calcularPerimetro();
        rec.dibujarRectangulo();
        
    }

}
