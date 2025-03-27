package javadoc2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EstudianteTest {
    
    @Test
    public void testConstructorAndGetters(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        assertEquals("Marcos", estudiante.getNombre());
        assertEquals(20, estudiante.getEdad());
        assertEquals(0.0, estudiante.getCalificacion());
    }

    @Test
    public void testSetters(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        estudiante.setNombre("Nombre1");
        estudiante.setEdad(100);
        estudiante.setCalificacion(10.0);

        assertEquals("Nombre1", estudiante.getNombre());
        assertEquals(100, estudiante.getEdad());
        assertEquals(10.0, estudiante.getCalificacion());
    }

    @Test
    public void testAprobo(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        estudiante.setCalificacion(10.0);

        assertEquals(true, estudiante.aprobo());
    }

    @Test
    public void testEdadEscolar(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        assertEquals(1, estudiante.edadEscolar());
    }

    @Test
    public void testEsUniversitario(){

        Estudiante estudiante = new Estudiante("Marcos", 20);

        assertEquals(true, estudiante.esUniversitario());

    }
}
