
package AppNIf;

import entidad.Nif;
import servicio.NifServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        NifServicio nS = new NifServicio();
        Nif obj = nS.crearNif();
        nS.mostrar(obj);
    }
}
