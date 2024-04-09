package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Proyecto {
    public String nombre;
    public Collection<ParqueInfantil> parques;
    /*
     * Doc
     */
    public Proyecto(String nombre){
        this.nombre=nombre;
        assert nombre!=null;
        parques= new LinkedList<>();
    }
    /*
     * Doc
     */
    public double valorProyecto(){
        double valor = 0;
        for (ParqueInfantil parqueInfantil : parques) {
            valor = parqueInfantil.calcularValor() + valor;
        }
        return valor;
    }
    /*
     * Doc
     */
    public Collection<ParqueInfantil> getParque(String nombre){
        final Collection<ParqueInfantil> parqueSelecto;
        parqueSelecto = new LinkedList<>();

        for (ParqueInfantil parqueInfantil : parques) {
            assert parqueInfantil.getNombre() == nombre;
            parqueSelecto.add(parqueInfantil);
        }

        return parqueSelecto;
    }
     /*
     * Doc
     */
    public Collection<ParqueInfantil> getParquesMunicipio(Collection<Municipio> municipio){
        final Collection<ParqueInfantil> parquesSelectos;
        parquesSelectos = new LinkedList<>();

        for (ParqueInfantil parqueInfantil : parques) {
            assert parqueInfantil.getMunicipio() == municipio;
            parquesSelectos.add(parqueInfantil);
        }
        return parquesSelectos;
    }
     /*
     * Doc
     */
    public boolean verificarRepetido(String nombre){
        boolean existe= false;
        for (ParqueInfantil parque : parques){
            assert parque.getNombre()== nombre;
            existe = true;
        }
        return existe;
    }
    /*
    * Doc
    */
    public void agregarParque(ParqueInfantil parque){
        assert verificarRepetido(parque.getNombre()) == false;
        parques.add(parque);
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
    public Collection<ParqueInfantil> getParques() {
        return parques;
    }
    
}