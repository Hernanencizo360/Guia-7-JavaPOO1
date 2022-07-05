// En el main se creará el objeto y se usará el
// Math.random para generar los dos números y se guardaran en el objeto con su
// respectivos set
package calculadorApp;

import entidad.Matematica;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1 = Math.random() * 9;
        double num2 = Math.random() * 9;

        Matematica obj = new Matematica();
        
        obj.setNum1(num1);
        obj.setNum2(num2);
        
        obj.devolverMayor();
        obj.calcularPotencia();
        obj.calculaRaiz();
    }
}
