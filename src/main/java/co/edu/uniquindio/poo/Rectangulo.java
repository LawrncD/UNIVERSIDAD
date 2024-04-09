package co.edu.uniquindio.poo;

public class Rectangulo extends Zona {
    public double ancho;
    public double largo;
    /*
     * Doc
     */
    public Rectangulo(String nombre, double area, double largo, double ancho){
        super(nombre, area);
        this.ancho = ancho;
        this.largo = largo;
        assert ancho > 0;
        assert largo >0;
    }
    /*
     * Doc
     */
    public double getAncho() {
        return ancho;
    }
    /*
     * Doc
     */
    public double getLargo() {
        return largo;
    }
    
}
    

