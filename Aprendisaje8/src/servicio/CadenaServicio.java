package servicio;

import entidad.Cadena;

/**
 *
 * @author Hernan
 */
public class CadenaServicio {
    //Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada. 

    public void mostrarVocales(Cadena obj1) {
        String frase = obj1.getFrase();
        frase = frase.toUpperCase();

        System.out.println("La frase es: " + frase);
        String letra;
        int cantVocales = 0;
        int longitud = obj1.getLongitud();

        for (int i = 0; i < longitud; i++) {
            letra = frase.substring(i, i + 1);
            if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
                cantVocales++;
            }
        }
        System.out.println("La frase posee " + cantVocales + " vocales.");

        System.out.println("----------------------------------------------------------------------------------------");
       
    }

    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //   ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena obj1) {
        String frase = obj1.getFrase();
        int largo = obj1.getLongitud();
        String fraseInv = "";

        for (int i = largo - 1; i >= 0; i--) {
            fraseInv = fraseInv + frase.charAt(i);
        }
        System.out.println("Frase invertida: " + fraseInv);

        System.out.println("----------------------------------------------------------------------------------------");
    }

    // Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    // contabilizar cuántas veces se repite el carácter en la frase, por ejemplo: 
    public void vecesRepetido(String letra, Cadena obj1) {
        String frase = obj1.getFrase();
        frase = frase.toUpperCase();
        letra = letra.toUpperCase();

        int vecesLetra = 0;
        int largo = obj1.getLongitud();
        String caracter;

        for (int i = 0; i < largo; i++) {
            caracter = frase.substring(i, i + 1);

            if (letra.equals(caracter)) {
                vecesLetra++;
            }
        }
        System.out.println("El cáracter se repite: " + vecesLetra + " veces en la frase.");

        System.out.println("----------------------------------------------------------------------------------------");
    }

    //Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    // compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(String frase, Cadena obj1) {
        int fraseOriginal = obj1.getLongitud();
        int fraseNueva = frase.length();

        if (fraseOriginal == fraseNueva) {
            System.out.println("Ambas frases tienen la misma longitud.");
        } else {
            System.out.println("Las frases no poseen la misma longitud.");
        }
        System.out.println("----------------------------------------------------------------------------------------");
    }

    //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
    // una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(String frase, Cadena obj1) {
        String fraseOriginal = obj1.getFrase();
        String fraseUnida;

        fraseUnida = fraseOriginal.concat(" " + (frase));

        System.out.println("La frase unida es: " + fraseUnida);
        System.out.println("----------------------------------------------------------------------------------------");
    }

    //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
    //frase resultante.
    public void reemplazar(String letra, Cadena obj1) {
        String fraseOriginal = obj1.getFrase();
        int largo = obj1.getLongitud();
        String caracter;
        String fraseRemplazo = "";

        for (int i = 0; i < largo; i++) {
            caracter = fraseOriginal.substring(i, i + 1);
            caracter = caracter.toUpperCase();
            if (caracter.equals("A")) {
                fraseRemplazo = fraseRemplazo.concat(letra);
            } else {
                fraseRemplazo = fraseRemplazo.concat(caracter);
            }
        }
        System.out.println("La frase nueva es: " + fraseRemplazo);
        System.out.println("----------------------------------------------------------------------------------------");
    }

    //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    // ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(String letra, Cadena obj1) {
        String fraseOriginal = obj1.getFrase();
        int largo = obj1.getLongitud();
        String caracter;
        boolean retorno = false;

        for (int i = 0; i < largo; i++) {
            caracter = fraseOriginal.substring(i, i + 1);
            
            if (caracter.equals(letra)) {
                retorno = true;
                break;
            } else {
                retorno = false;
            }
        }
        return retorno;
    }
}
