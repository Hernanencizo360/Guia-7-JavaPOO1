//Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
//ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
//Hay que insertar estos 3 valores para construir el objeto a través de un método
//constructor. Luego, las operaciones que se podrán realizar son las siguientes:
package entidad;

/**
 *
 * @author Hernan
 */
public class Raices {

    // atributos.  
    private int a;
    private int b;
    private int c;

    public Raices(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    Método getDiscriminante(): devuelve el valor del discriminante (double). El
//    discriminante tiene la siguiente formula: (b^2)-4*a*c

    public double getDiscriminante() {
        double discriminante = Math.pow(b, 2) - 4 * a * c;
        return discriminante;
    }

    //• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0. 
    public boolean tieneRaices(Raices ob) {
        double discriminante = ob.getDiscriminante();
        boolean respuesta;

        respuesta = discriminante >= 0;
        return respuesta;
    }

//    • Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(double discriminante) {
        boolean respuesta;
        respuesta = discriminante == 0;
        return respuesta;
    }

    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
    //soluciones. 
    public void obtenerRaices(Raices ob) {
        System.out.println("Método obtenerRaices: ");
        boolean tieneRaices = ob.tieneRaices(ob);
        if ((tieneRaices == true) && ob.getDiscriminante() == 0) {
            System.out.println("EL discriminante es igual a 0.");
            System.out.println("Y tiene dos soluciones iguales: ");
            double x0 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / 2 * a;
            System.out.println("Por tanto el valor para ambas soluciones es: " + x0);
            System.out.println("---------------------------------------------");
        } else if (tieneRaices == true) {
            double x0 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / 2 * a;
            double x1 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / 2 * a;
            System.out.println("Primera solución: " + x0);
            System.out.println("Segunda solución: " + x1);
            System.out.println("---------------------------------------------");
        }
    }

//    Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible. 
    public void obtenerRaiz(Raices ob) {
        System.out.println("Método obtenerRaiz: ");
        double discriminante = ob.getDiscriminante();
        boolean tieneRaiz = ob.tieneRaiz(discriminante);

        if (tieneRaiz == true) {
            double x0 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / 2 * a;
            System.out.println("El valor de la solución es: " + x0);
            System.out.println("---------------------------------------------");
        }
    }

//Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void calcular(Raices ob) {
        System.out.println("################################################");
        System.out.println("Método calcular: ");
        if (ob.tieneRaiz(ob.getDiscriminante()) == true) {
            System.out.println("La respuesta del Método tieneRaiz fue: true.");
            ob.obtenerRaiz(ob);
        } else if (ob.tieneRaices(ob) == true) {
            System.out.println("La respuesta del Método tieneRaices fue: true.");
            ob.obtenerRaices(ob);
        } else if ((ob.tieneRaices(ob) == false) && (ob.tieneRaiz(ob.getDiscriminante()) == false)) {
            System.out.println("No xiste solucion Real Posible");
            System.out.println("---------------------------------------------");
        }
        System.out.println("################################################");
    }

}
