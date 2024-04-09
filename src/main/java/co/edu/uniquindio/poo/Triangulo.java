package co.edu.uniquindio.poo;

public class Triangulo extends Zona {
    public double base;
    public double altura;
    /*
     * Doc
     */
    public Triangulo(double base, double altura, String nombre, double area){
        super(nombre, area);
        this.base=base;
        this.altura=altura;
        assert altura > 0;
        assert base > 0;
    }
    /*
     * Doc
     */
    public double getBase() {
        return base;
    }
    /*
     * Doc
     */
    public double getAltura() {
        return altura;
    }
    
}