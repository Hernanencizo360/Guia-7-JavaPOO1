///1. Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.

package musica;

/**
 *
 * @author Hernan
 */
public class Cancion {
    // atributos
    private String titulo;
    private String autor;
    
    // constructor vacio y con parametros.
    public Cancion(){
        titulo = "";
        autor = "";
    }
    
    public Cancion(String titulo, String autor){
        
    }
    
    // métodos getter and setters.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
