package co.edu.uniquindio.poo;

public class Circulo extends Zona{
    public  double radio;
    
    /*
     * Doc
     */
    public Circulo(String nombre, double area, double radio) {
        super(nombre, area);
        this.radio= radio;
        assert radio > 0;
        
    }
    /*
     * Doc
     */
    public double getRadio() {
        return radio;
    }
    
}
