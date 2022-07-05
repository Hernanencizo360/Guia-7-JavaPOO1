//Crea una clase en Java donde declares una variable de tipo array de Strings que contenga
//los doce meses del año, en minúsculas. A continuación, declara una variable mesSecreto
//de tipo String, y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
package servicio;

/**
 *
 * @author Hernan
 */
public class Mes {
   
    public boolean mesGame(String mesInsert){
        String[] mes = {"enero", "febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String mesSecreto = mes[5];
        boolean acierto = false;
        
        if (mesInsert.equals(mesSecreto)){
            System.out.println("¡Ha acertado!");
            acierto = true;
        } else {
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes"); 
        }
        return acierto;
    }
}
