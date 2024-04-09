package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Zona {
    public String nombre;
    public double area;
    public Collection<Material> materialUnico;
    /*
     * Doc
     */
    public Zona(String nombre, double area){
        this.nombre=nombre;
        this.area= area;
        assert nombre != null;
        assert area > 0;
        materialUnico = new LinkedList<>();
    }
    /*
     * Doc
     */
    public double valorZona(){
        double valor = 0;
        for (Material material : materialUnico) {
            valor= material.getValorMetroCuadrado()*area;
        }
        return valor;
    }
    /*
     * Doc
     */
    public void agregarMateria(Material material){
        assert materialUnico.size() == 0;
        materialUnico.add(material);
    }
    /*
     * Doc
     */
    public String getNombre() {
        return nombre;
    }
    /*
     * Doc
     */
    public double getArea() {
        return area;
    }
    /*
     * Doc
     */
    public Collection<Material> getMaterial() {
        return materialUnico;
    }
    
}

