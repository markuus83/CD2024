package javadoc2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonaTest {
    
    @Test
    public void testConstrucorAndGetters(){

        Persona persona = new Persona("Marcos", 20);

        assertEquals("Marcos", persona.getNombre());
        assertEquals(20, persona.getEdad());
    }

    @Test
    public void testSetters(){

        Persona persona = new Persona("Marcos", 20);

        persona.setNombre("Nombre1");
        persona.setEdad(100);

        assertEquals("Nombre1", persona.getNombre());
        assertEquals(100, persona.getEdad());
    }

    @Test
    public void testImprimirDetalles(){

        Persona persona = new Persona("Marcos", 20);

        assertEquals("Nombre: "+persona.getNombre()+
                    "\nEdad: "+persona.getEdad(), persona.imprimirDetalles());
    }
}