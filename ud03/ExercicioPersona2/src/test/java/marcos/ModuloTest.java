package marcos;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuloTest {
    
    @Test
    public void testConstructor() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        assertEquals("1", modulo.getCodigo());
        assertEquals("Modulo1", modulo.getNombre());
        assertEquals("Descripcion1", modulo.getDescripcion());
        assertEquals(1, modulo.getHoras());
        assertEquals(1, modulo.getSesiones());
    }

    @Test
    public void testSetCodigo() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.setCodigo("2");

        assertEquals("2", modulo.getCodigo());
    }

    @Test
    public void testSetNombre() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.setNombre("Modulo2");

        assertEquals("Modulo2", modulo.getNombre());
    }

    @Test
    public void testSetDescripcion() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.setDescripcion("Descripcion2");

        assertEquals("Descripcion2", modulo.getDescripcion());
    }

    @Test
    public void testSetHoras() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.setHoras(2);

        assertEquals(2, modulo.getHoras());
    }

    @Test
    public void testSetSesiones() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.setSesiones(2);

        assertEquals(2, modulo.getSesiones());
    }

    @Test
    public void testToString() {

        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        assertEquals("Modulo {" +
                "codigo='" + modulo.getCodigo() + '\'' +
                ", nombre='" + modulo.getNombre() + '\'' +
                ", descripcion='" + modulo.getDescripcion() + '\'' +
                ", horas='" + modulo.getHoras() + '\'' +
                ", sesiones='" + modulo.getSesiones() + '\'' +
                "}", modulo.toString());
    }

    @Test
    public void testSesionesAp(){
        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.sesionesAp(1);
        assertEquals(2, modulo.getSesiones());
    }

    @Test
    public void testSesionesPD() {
        Modulo modulo = new Modulo("1", "Modulo1", "Descripcion1", 1, 1);

        modulo.sesionesPD(1);
        assertEquals(0, modulo.getSesiones()); 
    }
}
