/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(VeterinariaTest.class.getName());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void pruebaDatosCompletos() {
        LOG.info("inicio test prueba datos completos");
        Mascota mascota = new Mascota(1, "Estrellita", "Perro", "Labrador", 12, "Hembra", "Negro", 8.5);
        assertEquals(1, mascota.getId());
        assertEquals("Estrellita", mascota.getNombre());
        assertEquals("Perro", mascota.getEspecie());
        assertEquals("Labrador", mascota.getRaza());
        assertEquals(12, mascota.getEdad());
        assertEquals("Hembra", mascota.getGenero());
        assertEquals("Negro", mascota.getColor());
        assertEquals(8.5, mascota.getPeso());
        LOG.info("finalizado test pruebaDatosCompletos");
    }

    @Test
    public void pruebaAgregarMascota() {
        LOG.info("inicio test pruebaAgregarMascota");
        Veterinaria veterinaria = new Veterinaria();
        Mascota mascota = new Mascota(1, "Estrellita", "Perro", "Labrador", 12, "Hembra", "Negro", 8.5);
        veterinaria.agregarMascota(mascota);
        assertEquals(1, veterinaria.getMascotas().size());
        LOG.info("finalizado test pruebaAgregarMascota");
        
    }

    @Test
    public void pruebaAgregarVeterinariaNula() {
        LOG.info("inicio test pruebaAgregarVeterinariaNula");
        Veterinaria veterinaria = new Veterinaria();
        assertThrows(Throwable.class, () -> veterinaria.agregarMascota(null));
        LOG.info("finalizado test pruebaAgregarVeterinariaNula");
    }

    @Test
    public void pruebaAgregarMascotaRepetida() {
        LOG.info("inicio test pruebaAgregarMascotaRepetida");
        Veterinaria veterinaria = new Veterinaria();
        Mascota mascota1 = new Mascota(1, "Luna", "Perro", "Labrador", 12, "Hembra", "Negro", 8.5);
        Mascota mascota2 = new Mascota(1, "Max", "Gato", "Siames", 8, "Macho", "Blanco", 5.2);

        assertDoesNotThrow(() -> veterinaria.agregarMascotaConIdUnico(mascota1));

        assertThrows(MascotaExistenteException.class, () -> veterinaria.agregarMascotaConIdUnico(mascota2));
        LOG.info("finalizado test pruebaAgregarMascotaRepetida");
    }
}
    


