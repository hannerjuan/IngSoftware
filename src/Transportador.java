/**
 *@version 1.0
 * @author Mónica Daniela, Hanner Obando
 */
public class Transportador {
    /**
     * Calcula el valor que debe ser mayor al precio de volumen y precio de peso
     * @param transportable
     * @return precio en pesos
     */
    public double calcularPrecio(Transportable transportable){
       double valorPeso= transportable.calcularPeso()*3000;
       double valorVolumen= transportable.calcularVolumen()*20000;
       
       if (valorVolumen>=valorPeso){
           return valorVolumen;           
       }
       return valorPeso;
    }


    
    
}
