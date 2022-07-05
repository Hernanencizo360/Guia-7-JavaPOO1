/*
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
    (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
    métodos:
 */
package entidad;

import java.util.Date;

/**
 *
 * @author Hernan
 */
public class Persona {
    
    // atributos
    private String nombre; 
    private Date fechaDeNacimiento;
    
    // constructores
    public Persona(){
        
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    // metodos getters and setters. 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    @Override
    public String toString() {
        return "El nombre de la persona es: " + nombre + " y su fecha De Nacimiento es: " + fechaDeNacimiento;
    }   
}
