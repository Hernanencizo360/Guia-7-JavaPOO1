package calculadoraIMC;

import entidad.Persona;
import servicio.PersonaServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {

        // creo un objeto para enlazarme con el servicio 
        PersonaServicio pS = new PersonaServicio();

        //creo variables para almacenar los IMC y la mayoria de edad.
        int imcIdeal = 0, imcDebajo = 0, imcEncima = 0;
        int mayorEdad = 0, menorEdad = 0;

        // creo un vector de tipo Persona (Objeto). Para almacenar las personas que voy creando.
        Persona[] vectorP;
        vectorP = new Persona[4];

        // utilizo un ciclo for para rellenar el vector y a medida que voy creando la persona ejecutar los metodos o funciones.
        for (int i = 0; i < 4; i++) {

            // instancio un objeto Persona le doy el nombre p1 y lo creo a traves del metodo crearPersona. 
            Persona p1 = pS.crearPersona();

            // almaceno ese objeto p1 en la posicion i de mi arreglo.
            vectorP[i] = p1;

            // creo una variable IMC y lo voy a llenar con el resultado que me decuelva el metodo calcularIMC. "le envio mi objeto Persona(p1)"
            int IMC = pS.calcularIMC(p1);

            // creo un switch. Para tomar diferentes vias dependiendo del numero que tenga almacenado mi variable IMC. 
            switch (IMC) {
                case -1:
                    System.out.println("Está por debajo de su peso ideal.");
                    imcDebajo++;
                    break;
                case 0:
                    System.out.println("La persona está en su peso ideal.");
                    imcIdeal++;
                    break;
                case 1:
                    System.out.println("La persona tiene sobrepeso.");
                    imcEncima++;
                    break;
                default:
            }

            // A continuacion llamo a mi metodo esMayorDeEdad y dependiendo de su retorno tomara la via del true o false. 
            if (pS.esMayorDeEdad(p1) == true) {
                System.out.println(p1.getNombre() + " Es mayor de edad.");
                mayorEdad++;
            } else {
                System.out.println(p1.getNombre() + " No es mayor de edad.");
                menorEdad++;
            }

            // un sout cerrar la vuelta del for 
            System.out.println("---------------------------------------------------------------------------------------------------");

        }
        int pesoPorDebajo = (imcDebajo * 100) / 4;
        int pesoIdeal = (imcIdeal * 100) / 4;
        int pesoEncima = (imcEncima * 100) / 4;
        System.out.println("El porcentaje de personas por DEBAJO del IMC es del: " + pesoPorDebajo + "%");
        System.out.println("El porcentaje de personas con IMC IDEAL es del: " + pesoIdeal + "%");
        System.out.println("El porcentaje de personas por ENCIMA del IMC ideal es del: " + pesoEncima + "%");

        int personaMayores = (mayorEdad * 100) / 4;
        int personaMenores = (menorEdad * 100) / 4;
        System.out.println("El percontaje de personas que son mayores de edad es: " + personaMayores + "%");
        System.out.println("El percontaje de personas que son menores de edad es: " + personaMenores + "%");
    }
}


