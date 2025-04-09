package javadoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase para Test Unitarios Persona.
 */
public class PersonaTest {

    private final int veinte = 20;
    private final int cien = 100;

    @Test
    public void testConstrucorAndGetters() {

        Persona persona = new Persona("Marcos", veinte);

        assertEquals("Marcos", persona.getNombre());
        assertEquals(veinte, persona.getEdad());
    }

    @Test
    public void testSetters() {

        Persona persona = new Persona("Marcos", veinte);

        persona.setNombre("Nombre1");
        persona.setEdad(cien);

        assertEquals("Nombre1", persona.getNombre());
        assertEquals(cien, persona.getEdad());
    }

    @Test
    public void testImprimirDetalles() {

        Persona persona = new Persona("Marcos", veinte);

        assertEquals("Nombre: " + persona.getNombre() + "\nEdad: " + persona.getEdad(), persona.imprimirDetalles());
    }
}
