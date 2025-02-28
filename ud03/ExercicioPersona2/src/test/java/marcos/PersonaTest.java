package marcos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;

public class PersonaTest {
    
    @Test
    public void testConstructorAndGetters(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        assertEquals("Marcos", persona.getNombre());
        assertEquals("Chouza", persona.getApe1());
        assertEquals("Cruces", persona.getApe2());
        assertEquals("Chouza Cruces", persona.getApellidos());
        assertEquals("a23marcoss@iessanclemente.net", persona.getCorreo());
        assertEquals(666666666, persona.getMovil());
        assertEquals(new Date(19/9/2004), persona.getFecNacemento());
    }

    @Test
    public void testSetNombre(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setNombre("Nombre_1");

        assertEquals("Nombre_1", persona.getNombre());

    }

    @Test
    public void testSetApe1(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setApe1("Apellido_1");

        assertEquals("Apellido_1", persona.getApe1());

    }

    @Test
    public void testSetApe2(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setApe2("Apellido_2");

        assertEquals("Apellido_2", persona.getApe2());

    }

    @Test
    public void testSetCorreo(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setCorreo("Correo_1");

        assertEquals("Correo_1", persona.getCorreo());

    }

    @Test
    public void testSetMovil(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setMovil(111111111);

        assertEquals(111111111, persona.getMovil());

    }

    @Test
    public void testSetFecNacemento(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        persona.setFecNacemento(new Date(1/1/2025));

        assertEquals(new Date(1/1/2025), persona.getFecNacemento());

    }

    @Test
    public void testToString(){

        Persona persona = new Persona("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoss@iessanclemente.net", 666666666, new Date(19/9/2004));

        assertEquals("Persona {" +
               "dni='" + persona.getDni() + '\'' +
               ", nombre='" + persona.getNombre() + '\'' +
               ", apellidos='" + persona.getApellidos() + '\'' +
               ", correo='" + persona.getCorreo() + '\'' +
               ", móvil='" + persona.getMovil() + '\'' +
               ", fechaNacimiento=" + persona.getFecNacemento() +
               '}', persona.toString());
    }
}
