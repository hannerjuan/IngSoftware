
/**
 *
 * @author Mónica Daniela, Hanner Obando
 */
public class pruebas {
    private static final Transportable Transportable = null;

    public static void main(String[] args){
        
        //PRUEBA 1 RESULTADOS 0.024 , 0.096, 480    CORRECTO
        double resultado;
        double resultado2;

        Transportable elemento = new Paquete(0.4, 0.3, 0.2);
        Transportador transportador = new Transportador();
        System.out.println("volumen= "+elemento.calcularVolumen());
        System.out.println("Peso= "+elemento.calcularPeso());
        resultado = transportador.calcularPrecio(elemento);
        System.out.println("Precio "+resultado);

        //PRUEBA 2 
        Transportable elemento2 = new Mascota(20,Tamano.MEDIUM);
        System.out.println("Volumen es :"+elemento2.calcularVolumen());
        System.out.println("Peso "+elemento2.calcularPeso());
        resultado2 = transportador.calcularPrecio(elemento2);
        System.out.println("Precio "+resultado2);
    }
}
