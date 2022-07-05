//Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
package servicio;

import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        //El programa debe pedir al usuario que adivine el mes secreto. Si el usuario acierta mostrar
        //un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar el mes secreto. Un
        //ejemplo de ejecución del programa podría ser este:
        boolean acierto = false;
        Mes ob = new Mes();

        System.out.println("Bienvenido");
        System.out.println("Su misión es adivinar el mes secreto.");
        System.out.println("Introduzca el nombre del mes, en minúsculas: ");
        
        while (acierto == false) {
            
            Scanner leer = new Scanner(System.in);
            String mesInsert = leer.nextLine();

            acierto = ob.mesGame(mesInsert);
        }
    }
}
