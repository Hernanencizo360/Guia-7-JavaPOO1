/*
 *1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 */
package Entidad;



/**
 *
 * @author Hernan
 */
// creo la clase libro
public class Libro {

    // defino los atributos que tendran los objetos de esta clase
    private String Título, Autor;
    private int ISBN, NumeroDePaginas;

    // creo los constructores.
    // Primer constructor con todos los atributos pasados por parametro
    public Libro(String Título, String Autor, int ISBN, int NumeroDePaginas) {
        this.Título = Título;
        this.Autor = Autor;
        this.ISBN = ISBN;
        this.NumeroDePaginas = NumeroDePaginas;
    }

    // Segundo constructor vacio.
    public Libro() {

    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int NumeroDePaginas) {
        this.NumeroDePaginas = NumeroDePaginas;
    }

 
    // metodo toString para mostrar el libro

    @Override
    public String toString() {
        return "El libro tiene como título" + Título + ", su Autor es " + Autor + ", su ISBN es: " + ISBN + " y posee " + NumeroDePaginas +" páginas."+ '}';
    }

  
}
