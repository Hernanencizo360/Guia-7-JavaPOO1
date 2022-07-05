//    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//    resultado del calculo.
package servicio;

import entidad.Nif;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class NifServicio {
    public Nif crearNif(){
        Scanner leer = new Scanner(System.in);
        
        long dni; 
        String letra;
        
        System.out.println("Ingrese su número de DNI (sin puntos): ");
        dni = leer.nextLong();
        Nif obj = new Nif(dni);
        //Para calcular la letra se toma el resto de dividir el número
        //de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
        //un array (vector) de caracteres la posición que corresponda al resto de la división para
        //obtener la letra correspondiente. La tabla de caracteres es la siguiente:
        int resultado = (int) (dni % 23); 
        String[] arreglo = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        letra = arreglo[resultado];
        obj.setLetra(letra);
        return obj;
    }
   
        //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
        //mayúscula; por ejemplo: 00395469-F).
    public void mostrar(Nif obj){
        long dni = obj.getDni();
        
        // los 0 a la izquierda se pierden por tanto para mantenerlos utilizo la clase Formatter. 
        Formatter fmt = new Formatter();
        fmt.format("%08d", dni);
        System.out.println("El NIF de la persona es: ");
        System.out.println(fmt+ "-" + obj.getLetra());
    }
}
