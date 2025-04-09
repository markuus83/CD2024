package javadoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase para test unitarios Estudiante.
 */
public class EstudianteTest {

    private double cero;
    private final int uno = 1;
    private final int tres = 3;
    private final int diecisiete = 17;
    private final int veinte = 20;
    private final int cien = 100;
    private final double diez = 10.0;

    @Test
    public void testConstructorAndGetters() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        assertEquals("Marcos", estudiante.getNombre());
        assertEquals(veinte, estudiante.getEdad());
        assertEquals(cero, estudiante.getCalificacion());
    }

    @Test
    public void testSetters() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        estudiante.setNombre("Nombre1");
        estudiante.setEdad(cien);
        estudiante.setCalificacion(diez);

        assertEquals("Nombre1", estudiante.getNombre());
        assertEquals(cien, estudiante.getEdad());
        assertEquals(diez, estudiante.getCalificacion());
    }

    @Test
    public void testAprobo() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        estudiante.setCalificacion(diez);
        assertEquals(true, estudiante.aprobo());

        estudiante.setCalificacion(tres);
        assertEquals(false, estudiante.aprobo());
    }

    @Test
    public void testEdadEscolar() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        assertEquals(uno, estudiante.edadEscolar());
    }

    @Test
    public void testEsUniversitario() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        assertEquals(true, estudiante.esUniversitario());

        estudiante.setEdad(diecisiete);
        assertEquals(false, estudiante.esUniversitario());
    }

    @Test
    public void testImprimirInformacion() {

        Estudiante estudiante = new Estudiante("Marcos", veinte);

        estudiante.setCalificacion(diez);

        assertEquals(
                "Nombre: " + estudiante.getNombre() + "\nEdad: "
                        + estudiante.getEdad() + "\nCalificación: "
                        + estudiante.getCalificacion(),
                estudiante.imprimirInformacion());
    }
}
