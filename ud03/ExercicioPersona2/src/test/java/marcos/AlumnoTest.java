package marcos;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlumnoTest {
    
    @Test 
    public void testConstructorAndGetters(){

        Alumno alumno = new Alumno("12345678A", "Marcos", "Chouza", "Cruces","a23marcoscc@iessanclemente.net",666666666,new Date(01-01-2025),"12345",true);
        assertEquals("12345678A",alumno.getDni() );
        assertEquals("Marcos", alumno.getNombre());
        assertEquals("Chouza", alumno.getApe1());
        assertEquals("Cruces", alumno.getApe2());
        assertEquals("Chouza Cruces", alumno.getApellidos());
        assertEquals("a23marcoscc@iessanclemente.net", alumno.getCorreo());
        assertEquals(666666666,alumno.getMovil() );
        assertEquals( new Date(01-01-2025), alumno.getFecNacemento());
        assertEquals("12345" ,alumno.getCodigoXade());
        assertEquals(true, alumno.getAutorizaTutores());
    }

    @Test 
    public void testSetCodigoXade(){

        Alumno alumno = new Alumno("12345678A", "Marcos", "Chouza", "Cruces","a23marcoscc@iessanclemente.net",666666666,new Date(01-01-2025),"12345",true);

        alumno.setCodigoXade("NovoCodigo");
        assertEquals("NovoCodigo", alumno.getCodigoXade());
    }

    @Test 
    public void testSetAutorizaTutores(){

        Alumno alumno = new Alumno("12345678A", "Marcos", "Chouza", "Cruces","a23marcoscc@iessanclemente.net",666666666,new Date(01-01-2025),"12345",true);

        alumno.setAutorizaTutores(false);
        assertEquals(false, alumno.getAutorizaTutores());
    }

    @Test 
    public void testToString(){

        Alumno alumno = new Alumno("12345678A", "Marcos", "Chouza", "Cruces","a23marcoscc@iessanclemente.net",666666666,new Date(01-01-2025),"12345",true);

        assertEquals("Persona -> Alumno {" +
                "dni='" + alumno.getDni() + '\'' +
                ", nombre='" + alumno.getNombre() + '\'' +
                ", apellidos='" + alumno.getApellidos() + '\'' +
                ", correo='" + alumno.getCorreo() + '\'' +
                ", móvil='" + alumno.getMovil() + '\'' +
                ", fechaNacimiento=" + alumno.getFecNacemento() + '\'' +
                ", codigoXade='" + alumno.getCodigoXade() + '\'' +
                ", autorizaTutores='" + alumno.getAutorizaTutores() + '\'' +
                "}", alumno.toString());
    }
}