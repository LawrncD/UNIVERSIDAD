package co.edu.uniquindio.poo;

public class Cuadrado extends Zona{
    public double lado;
    /*
     * Doc
     */
    public Cuadrado(double lado, String nombre, double area){
        super(nombre, area);
        this.lado = lado;
        assert lado > 0;
    }
    /*
     * Doc
     */
    public double getLado() {
        return lado;
    }
    
}