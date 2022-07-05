/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import entidad.Operacion;
import servicio.servicioOperacion;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioOperacion sO = new servicioOperacion();
        // tengo que instanciar un objeto de operacion; (obj) que sera el que gurade el objeto de retorno de la funcion crear operacion
        Operacion obj = sO.crearOperacion(); // utilizo mi metodo crearOperacion para asignar valores al objeto de la clase Operacion
        sO.sumar(obj);
        sO.restar(obj);
        sO.multiplicar(obj);
        sO.dividir(obj);
    }
}
