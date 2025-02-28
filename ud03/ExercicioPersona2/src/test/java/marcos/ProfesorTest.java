package marcos;

import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProfesorTest {
    
    @Test
    public void testConstructorANdGetters(){

        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        assertEquals("12345678A", profesor.getDni());
        assertEquals("Marcos", profesor.getNombre());
        assertEquals("Chouza", profesor.getApe1());
        assertEquals("Cruces", profesor.getApe2());
        assertEquals("Chouza Cruces", profesor.getApellidos());
        assertEquals("a23marcoscc@iessanclemente.net", profesor.getCorreo());
        assertEquals(666666666, profesor.getMovil());
        assertEquals(new Date(19/9/2004), profesor.getFecNacemento());
        assertEquals("Informática", profesor.getEspecialidad());
        assertEquals("Cuerpo1", profesor.getCuerpo());
        assertEquals(false, profesor.getSustituto());
        assertEquals(new Date(12/4/2016), profesor.getFecOposicion());
    }

    @Test
    public void testSetEspecialidad(){
     
        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        profesor.setEspecialidad("Inglés");
        
        assertEquals("Inglés", profesor.getEspecialidad());;
    }

    @Test
    public void testSetCuerpo(){

        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        profesor.setCuerpo("Nuevo_Cuerpo");

        assertEquals("Nuevo_Cuerpo", profesor.getCuerpo());

    }

    @Test
    public void testSetSustituto(){

        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        profesor.setSustituto(true);

        assertEquals(true, profesor.getSustituto());

    }

    @Test
    public void testFecOposicion(){

        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        profesor.setFecOposicion(new Date(1/1/2000));

        assertEquals(new Date(1/1/2000), profesor.getFecOposicion());

    }

    @Test
    public void testToString(){

        Profesor profesor = new Profesor("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(19/9/2004), "Informática", "Cuerpo1", false, new Date(12/4/2016));

        assertEquals("Persona -> Profesor {" +
                "dni='" + profesor.getDni() + '\'' +
                ", nombre='" + profesor.getNombre() + '\'' +
                ", apellidos='" + profesor.getApellidos() + '\'' +
                ", correo='" + profesor.getCorreo() + '\'' +
                ", móvil='" + profesor.getMovil() + '\'' +
                ", fechaNacimiento=" + profesor.getFecNacemento() + '\'' +
                ", especialidad='" + profesor.getEspecialidad() + '\'' +
                ", cuerpo='" + profesor.getCuerpo() + '\'' +
                ", sustituo='" + profesor.getSustituto() + '\'' +
                ", fecOposicion='" + profesor.getFecOposicion() + '\'' +
                "}", profesor.toString());

    }
}
