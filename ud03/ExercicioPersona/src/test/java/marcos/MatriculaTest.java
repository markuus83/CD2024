package marcos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Date;

public class MatriculaTest {
    
    @Test
    public void testConstructor() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");

        assertEquals("12345678A", matricula.getAlumno().getDni());
        assertEquals("Marcos", matricula.getAlumno().getNombre());
        assertEquals("Chouza", matricula.getAlumno().getApe1());
        assertEquals("Cruces", matricula.getAlumno().getApe2());
        assertEquals("Chouza Cruces", matricula.getAlumno().getApellidos());
        assertEquals("a23marcoscc@iessanclemente.net", matricula.getAlumno().getCorreo());
        assertEquals(666666666, matricula.getAlumno().getMovil());
        assertEquals(new Date(01-01-2025), matricula.getAlumno().getFecNacemento());
        assertEquals("12345", matricula.getAlumno().getCodigoXade());
        assertEquals(false, matricula.getAlumno().getAutorizaTutores());
        assertEquals("1", matricula.getModulo().getCodigo());
        assertEquals("Modulo1", matricula.getModulo().getNombre());
        assertEquals("Descripcion1", matricula.getModulo().getDescripcion());
        assertEquals(1, matricula.getModulo().getHoras());
        assertEquals(1, matricula.getModulo().getSesiones());
        assertEquals(1, matricula.getNota());
        assertEquals("Curso1", matricula.getCurso());
    }

    @Test
    public void testSetAlumno() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");

        matricula.setAlumno(new Alumno("9999999Z", "Nombre", "Ape1", "Ape2", "correofalso@gmail.com", 111111111, new Date(01-01-2024), "11111", true));

        assertEquals("9999999Z", matricula.getAlumno().getDni());
        assertEquals("Nombre", matricula.getAlumno().getNombre());
        assertEquals("Ape1", matricula.getAlumno().getApe1());
        assertEquals("Ape2", matricula.getAlumno().getApe2());
        assertEquals("Ape1 Ape2", matricula.getAlumno().getApellidos());
        assertEquals("correofalso@gmail.com", matricula.getAlumno().getCorreo());
        assertEquals(111111111, matricula.getAlumno().getMovil());
        assertEquals(new Date(01-01-2024), matricula.getAlumno().getFecNacemento());
        assertEquals("11111", matricula.getAlumno().getCodigoXade());
        assertEquals(true, matricula.getAlumno().getAutorizaTutores());
    }

    @Test
    public void testSetModulo() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");

        matricula.setModulo(new Modulo("2", "Modulo2", "Descripcion2", 2, 2));

        assertEquals("2", matricula.getModulo().getCodigo());
        assertEquals("Modulo2", matricula.getModulo().getNombre());
        assertEquals("Descripcion2", matricula.getModulo().getDescripcion());
        assertEquals(2, matricula.getModulo().getHoras());
        assertEquals(2, matricula.getModulo().getSesiones());

    }    


    @Test
    public void testSetNota() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");

        matricula.setNota(2);
        assertEquals(2, matricula.getNota());
    }


    @Test
    public void testSetCurso() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");
        
        matricula.setCurso("Curso2");
        assertEquals("Curso2", matricula.getCurso());
    }

    @Test
    public void testToString() {

        Matricula matricula = new Matricula(new Alumno("12345678A", "Marcos", "Chouza", "Cruces", "a23marcoscc@iessanclemente.net", 666666666, new Date(01-01-2025), "12345", false), new Modulo("1", "Modulo1", "Descripcion1", 1, 1), 1, "Curso1");

        assertEquals("Matricula {" +
                "alumno='" + matricula.getAlumno() + '\'' +
                ", modulo='" + matricula.getModulo() + '\'' +
                ", nota='" + matricula.getNota() + '\'' +
                ", curso='" + matricula.getCurso() + '\'' +
                "}", matricula.toString());
    }
}
