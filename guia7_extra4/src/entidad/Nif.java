//Crear una clase NIF que se usará para mantener DNIs con su
//correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra
//(String o char) que le corresponde. Dispondrá de los siguientes métodos:
package entidad;

/**
 *
 * @author Hernan
 */
public class Nif {
    // atributos
    private long dni; 
    private String letra;

    // constructor 
    public Nif(long DNI, String letra) {
        this.dni = DNI;
        this.letra = letra;
    }

    public Nif(long dni) {
        this.dni = dni;
    }
    

    //• Métodos getters y setters para el número de DNI y la letra.

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
//    Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//    corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//    resultado del calculo.

}
