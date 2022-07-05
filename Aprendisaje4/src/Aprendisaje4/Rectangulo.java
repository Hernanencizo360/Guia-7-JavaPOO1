/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo 
y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2
 */
package Aprendisaje4;

/**
 *
 * @author Hernan
 */
public class Rectangulo {
    // atributos

    private int Base;
    private int Altura;
// Constructores

    public Rectangulo() {

    }

    public Rectangulo(int Base, int Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    // metodos set get

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    public void crearRectangulo() {
        System.out.println("Se ha creado un rectangulo");
    }

    public void calcularSuperficie() {
        int superficie;
        superficie = Base * Altura;
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void calcularPerimetro() {
        int perimetro;
        perimetro = (Base + Altura) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujarRectangulo() {
  
        for (int i = 0; i < Base; i++) {
            for (int j = 0; j < Altura; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
