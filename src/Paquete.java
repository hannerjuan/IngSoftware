
/**
 * Paquete que se va a envíar con su respectivo cálculo de volumen y peso
 *@version 1.0
 * @author Mónica Daniela, Hanner Obando
 */
public class Paquete implements Transportable{
    private double largo=0;
    private double ancho=0;
    private double alto=0;

    /*
    Dimensiones del paquete
    */
    
    public Paquete(double largo, double ancho, double alto) {
        super();
        this.largo= largo;
        this.ancho= ancho;
        this.alto= alto;
    }

    /**
     * @return the largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public double getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double calcularVolumen(){
         double volumen=0;
         return volumen= this.alto*this.ancho*this.largo;
     }

    @Override
    public double calcularPeso() {
        return this.calcularVolumen()*4;
    }
        
    
}
