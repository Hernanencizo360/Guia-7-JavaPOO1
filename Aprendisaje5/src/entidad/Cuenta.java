/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes 
*/
package entidad;

/**
 *
 * @author Hernan
 */
public class Cuenta {

    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    private int interes;

    // constructor por defecto
    public Cuenta() {

    }

    // constructor con parametros
    public Cuenta(int numeroCuenta, long dniCliente, int saldoActual, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    // metodos getter and setter.
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getInteres() {
        return interes;
    }

    public void setInteres(int interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta: " + "Su numero de cuenta es: " + numeroCuenta + ", DNI del Cliente: " + dniCliente + ", su saldo actual es: " + saldoActual + " y sus interes es: " + interes + '}';
    }
    

}
