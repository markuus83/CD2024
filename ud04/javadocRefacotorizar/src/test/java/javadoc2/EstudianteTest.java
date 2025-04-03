package javadoc2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class EstudianteTest {

    private double cero = 0.0;
    private int uno = 1;
    private int tres = 3;
    private int diecisiete= 17;
    private int veinte = 20;
    private int cien = 100; 
    private double diez = 10.0;

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
