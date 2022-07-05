//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
//atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
//jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
//parámetros que sean necesarios:
//• Constructores, tanto el vacío como el parametrizado.
package entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan
 */
public class Ahorcado {

    // atributos
    private String[] vector;
    private int letrasEncontradas;
    private int jugadasMax;

    // constructores.
    public Ahorcado() {

    }

    public Ahorcado(int letrasEncontradas, int jugadasMax) {
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMax = jugadasMax;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

//Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. Con
//la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
//Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
//palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el
//valor que ingresó el usuario y encontradas en 0.
    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado ob) {
        String buscarPalabra = JOptionPane.showInputDialog("Ingrese la palabra.");
        int jugadaMax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de jugadas máximas: "));
       
        int longitud = buscarPalabra.length();
        vector = new String[longitud];
        
        for (int i = 0; i < longitud; i++) {
            vector[i] = buscarPalabra.substring(i,i+1);
        }
        ob.setJugadasMax(jugadaMax);
        ob.setLetrasEncontradas(0);
    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.

    public int longitud() {
        return vector.length;
    }
//Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

    public boolean buscar(String letra) {
        boolean respuesta = false;
        int longitud = vector.length;
        int veces = 0;
        

        for (int i = 0; i < longitud; i++) {
            if (vector[i].equals(letra)) {
                letrasEncontradas++;
                veces++;
                respuesta = true;
            }
        }

        if (respuesta == false) {
            System.out.println("La letra no se encuentra en la palabra");
        } else {
            System.out.println("La letra se encuentra en la palabra " + veces + " veces.");
        }
        
        return respuesta;
    }
//Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.

    public void encontradas(String letra) {
        boolean encontrada = buscar(letra);

        int faltantes = vector.length - letrasEncontradas;
        System.out.println("Has encontrado " + letrasEncontradas + " letras.");
        System.out.println("Te faltan encontar " + faltantes + ".");

        if (encontrada == false) {
            jugadasMax--;
        } 
    }

//Método intentos(): para mostrar cuantas oportunidades le queda al jugador
    public void intentos() {
        System.out.println("Y te quedan " + jugadasMax + " oportunidades de fallar.");
    }

//Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main
    public void juego(Ahorcado ob) {
        // metodo crearJuego().
        crearJuego(ob);

        // metodo Longitud().
        System.out.println("Debe adivinar " + longitud() + " letras.");
        System.out.println("Y cuentas con " + jugadasMax + " intentos, para hallarlas.");
        System.out.println("Comencemos...");
        
        

        while ((jugadasMax > 0) && (letrasEncontradas != vector.length)) {
            System.out.println("----------------------------------------------------");
            System.out.println("Ingrese una letra para buscar en la palabra");
            String letra = leer.nextLine();

            encontradas(letra);
            intentos();
        }

        if ((jugadasMax != 0) && (letrasEncontradas == vector.length)) {
            JOptionPane.showMessageDialog(null," ¡¡¡FELICIDADES!!! \n Ganaste el juego");
            
        } else {
            JOptionPane.showMessageDialog(null,"        ¡¡Perdiste!! \n Intentalo de Nuevo");
        }
    }
}
