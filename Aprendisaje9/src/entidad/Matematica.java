package entidad;

/**
 *
 * @author Hernan
 */
public class Matematica {

    private static double num1;
    private static double num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        Matematica.num1 = num1;
        Matematica.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        Matematica.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        Matematica.num2 = num2;
    }

    public void devolverMayor() {
        if (num1 > num2) {
            System.out.println("El atributo num1 posee el mayor valor."
                    + "\n"
                    + "num1 = " + num1
                    + "\n"
                    + "num2 = " + num2);
        } else {
            System.out.println("El atributo num2 posee el mayor valor."
                    + "\n"
                    + "num2 = " + num2
                    + "\n"
                    + "num1 = " + num1);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    //Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
    //al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia() {
        if (num1 > num2) {
            
            int redondear1 = (int) Math.rint(num1);
            int redondear2 = (int) Math.rint(num2);
            double potencia1 = Math.pow(num1, num2);
            System.out.println("num1 elevado a num2 es: " + potencia1);
        } else {
             
            int redondear1 = (int) Math.rint(num1);
            int redondear2 = (int) Math.rint(num2);
            double potencia2 = Math.pow(num2, num1);
            System.out.println("num2 elevado a num1 es: " + potencia2);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    // c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //  Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calculaRaiz() {
        if (num1 < num2) {
            double raiz = Math.sqrt(Math.abs(num1));
            System.out.println("El menor de los dos valores es num1 y su raiz cuadrada es: " + raiz);
        } else {
            double raiz = Math.sqrt(Math.abs(num2));
            System.out.println("El menor de los dos valores es num2 y su raiz cuadrada es: " + raiz);
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }
}
