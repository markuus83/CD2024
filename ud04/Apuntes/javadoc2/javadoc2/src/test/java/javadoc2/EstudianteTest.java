package javadoc2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Pruebas de la clase EstudianteTest
 */
public class EstudianteTest {

    
    @Test
    public void ConstructorAndGetters() {

        Estudiante estudiante = new Estudiante("Marcos", 20);

        assertEquals("Marcos", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());

        estudiante.setCalificacion(10);
        assertEquals(10, estudiante.getCalificacion());
    }

    @Test
    public void setNombre() {

        Estudiante estudiante = new Estudiante("Marcos", 20);

        assertEquals("Marcos", estudiante.getNombre());

        estudiante.setNombre("Miau");
        assertEquals("Miau", estudiante.getNombre());
    }

    @Test
    public void aprobo() {

        Estudiante estudiante = new Estudiante("Marcos", 20);

        estudiante.setCalificacion(10);
        assertEquals(true, estudiante.aprobo());

        estudiante.setCalificacion(4);
        assertEquals(false, estudiante.aprobo());
    }

    @Test
    public void edadEscolar() {

        Estudiante estudiante = new Estudiante("Marcos", 24);

        assertEquals(2, estudiante.edadEscolar());
    }

    @Test
    public void esUniversitario() {

        Estudiante estudiante = new Estudiante("Marcos", 24);

        assertEquals(true, estudiante.esUniversitario());

        estudiante.setEdad(17);
        assertEquals(false, estudiante.esUniversitario());
    }
    
}
