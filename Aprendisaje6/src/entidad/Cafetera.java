/*
 *   Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
     (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
     actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
•    Constructor predeterminado o vacío
•    Constructor con la capacidad máxima y la cantidad actual
•    Métodos getters y setters
 */
package entidad;
/**
 *
 * @author Hernan
 */
public class Cafetera {
    
    //Atributos atributos capacidadMaxima y cantidadActual
    private int capacidadMaxima;
    private int cantidadActual;
    
    //Constructor predeterminado o vacío
    public Cafetera(){
        
    }
   
    //Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }
    
    //Métodos getters y setters

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    // Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima
    
    public void llenarCafetera(Cafetera obj){
        System.out.println("llenando cafetera...");
        int capacidad = obj.getCapacidadMaxima();
        obj.setCantidadActual(capacidad);
        
        System.out.println("Completado...");
        System.out.println("La cafetera actualmente posee: " + obj.getCantidadActual() + "mL de rico café Nespresso ;)");
        System.out.println("--------------------------------------------------------------");
    }
    
    /*
        Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
        tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
        cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
        método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
        cuanto quedó la taza.
    */
    public void servirTaza(int tamañoTaza, Cafetera obj){
        int cafeActual = obj.getCantidadActual();
        
        if (cafeActual < tamañoTaza){
            System.out.println("La cantidad no alcanza para llenar la taza. Se sirvió " + cafeActual + "de cafe");
            obj.setCantidadActual(0);
        } else {
            obj.setCantidadActual(cafeActual - tamañoTaza);
            System.out.println("Felicidades su taza se ha llenado por completo");
        }  
        System.out.println("--------------------------------------------------------------");
    }
    
    //• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(Cafetera obj){
        System.out.println("Eligio vaciar su cafetera");
        obj.setCantidadActual(0);
        System.out.println("Cafetera vacía.... :( ");
        System.out.println("--------------------------------------------------------------");
    }
    
    //Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
    //recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cantidadAñadirCafe, Cafetera obj){
        int cantidadActualCafe = obj.getCantidadActual();
        int reset = cantidadActualCafe + cantidadAñadirCafe;
        obj.setCantidadActual(reset);
        System.out.println("La cantidad actual de café es: " + obj.getCantidadActual());
        System.out.println("--------------------------------------------------------------");
    }
}
