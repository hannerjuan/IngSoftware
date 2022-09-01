/**
 *@version 1.0
 * @author Mónica Daniela, Hanner Obando
 */
public interface Transportable {
    /*
    Cslcula el peso del objeto que se va a transportar
    para saber si se puede enviar
    */
    
    public abstract double calcularPeso();
    
    /*
    calcula el volumen del objeto a transportar para verificar si cabe en el paquete
    */
    public abstract double calcularVolumen();

}
