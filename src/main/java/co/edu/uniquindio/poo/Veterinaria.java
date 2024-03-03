package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private List<Mascota> mascotas;

    public Veterinaria() {
        mascotas = new ArrayList<>();
    }

    // Agregar una mascota a la lista
    public void agregarMascota(Mascota mascota) {
        if (mascota == null) {
            throw new NullPointerException("La mascota no puede ser nula");
        }
        mascotas.add(mascota);
        
    }

    // Obtener la lista de mascotas mayores a 10 años
    public List<Mascota> obtenerMascotasMayoresA10() {
        List<Mascota> mayoresA10 = new ArrayList<>();
        for (Mascota mascota : mascotas) {
            if (mascota.getEdad() > 10) {
                mayoresA10.add(mascota);
            }
        }
        return mayoresA10;
    }

    // Agregar una mascota con ID único
    public void agregarMascotaConIdUnico(Mascota mascota) throws MascotaExistenteException {
        for (Mascota m : mascotas) {
            if (m.getId() == mascota.getId()) {
                throw new MascotaExistenteException("La mascota con el ID " + mascota.getId() + " ya existe.");
            }
        }
        mascotas.add(mascota);
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }
}
    

