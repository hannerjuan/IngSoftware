
/**
 * Mascota que se va a transportar
 *@version 1.0
 * @author Mónica Daniela, Hanner Obando
 */
public class Mascota implements Transportable{
    private double peso=0;
    private Tamano tamaño;

    public Mascota(double peso, Tamano tamaño) {
        super();
        this.peso=peso;
        this.tamaño=tamaño;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tramaño
     */
    public  Tamano getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(Tamano tamaño) {
        this.tamaño = tamaño;
    }
    
    public double calcularPeso(){
        this.peso = peso;
        return peso;
    }
    /*
    Se calcula el volumen de cada mascota dependiendo del tamaño
    */    
    
    @Override
    public double calcularVolumen() {
        if (this.tamaño==Tamano.SMALL){
            return 0.125;
        }
        if (this.tamaño==Tamano.MEDIUM){
            return 2;
        }
        else {
            return 8;
        }
        
    }
}
