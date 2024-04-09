package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class ParqueInfantil {
    public String nombre;
    public String descripcion;
    public Collection<Zona> zonas;
    public Collection<Municipio> municipioUnico;
     /*
     * Doc
     */
    public ParqueInfantil(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        assert nombre != null;
        assert descripcion != null;
        zonas = new LinkedList<>();
        municipioUnico = new LinkedList<>();
    }
    /*
     * Doc
     */
    public double calcularValor(){
        double valor = 0;
        for (Zona zona : zonas) {
            valor= zona.valorZona() + valor;
        }
        for (Municipio municipio : municipioUnico) {
            valor = municipio.getSobrecosto()+valor;
        }
        return valor;
    }
    /*
     * Doc
     */
    public boolean verificarRepetido(String nombre){
        boolean existe= false;
        for (Zona zona : zonas){
            assert zona.getNombre()== nombre;
            existe = true;
        }
        return existe;
    }
    /*
     * Doc
     */
    public void agregarZona(Zona zona){
        assert verificarRepetido(zona.getNombre())==false;
        zonas.add(zona);
    }
    /*
     * Doc
     */
    public void agregarMunicipio(Municipio municipio){
        assert municipioUnico.size() == 0;
        municipioUnico.add(municipio);
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
    public String getDescripcion() {
        return descripcion;
    }
    /*
     * Doc
     */
    public Collection<Zona> getZonas() {
        return zonas;
    }
    /*
     * Doc
     */
    public Collection<Municipio> getMunicipio() {
        return municipioUnico;
    }
    
    
}
