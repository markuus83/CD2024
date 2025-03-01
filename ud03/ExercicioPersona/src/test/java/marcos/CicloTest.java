package marcos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CicloTest {

    @Test
    public void testConstructorAndGetters(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        assertEquals("1", ciclo.getCodigo());;
        assertEquals("Marcos", ciclo.getNombre());
        assertEquals("Nivel1", ciclo.getNivel().getNivel());
        assertEquals(1, ciclo.getCentro().getCodigo());
        assertEquals("San Clemente", ciclo.getCentro().getNombre());
        assertEquals("Santiago de Compostela", ciclo.getCentro().getLocalidad());
        assertEquals("Rúa San Clemente", ciclo.getCentro().getCalle());
        assertEquals("1", ciclo.getCentro().getNumero());
        assertEquals(15706, ciclo.getCentro().getCodigoPostal());
    }

    @Test
    public void testSetCodigo(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        ciclo.setCodigo("Nuevo_Codigo");
        assertEquals("Nuevo_Codigo", ciclo.getCodigo());
    }

    @Test
    public void testSetNombre(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        ciclo.setNombre("Nuevo_Nombre");
        assertEquals("Nuevo_Nombre", ciclo.getNombre());
    }


    @Test
    public void testSetNivel(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        ciclo.setNivel(new Nivel("Nuevo_Nivel"));
        assertEquals("Nuevo_Nivel", ciclo.getNivel().getNivel());
    }

    @Test
    public void testSetCentro(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        ciclo.setCentro(new Centro(2, "Nuevo_Centro", "Nueva_Localidad", "Nueva_Calle", "2", 15707));
        assertEquals(2, ciclo.getCentro().getCodigo());
        assertEquals("Nuevo_Centro", ciclo.getCentro().getNombre());
        assertEquals("Nueva_Localidad", ciclo.getCentro().getLocalidad());
        assertEquals("Nueva_Calle", ciclo.getCentro().getCalle());
        assertEquals("2", ciclo.getCentro().getNumero());
        assertEquals(15707, ciclo.getCentro().getCodigoPostal());
    }
    
    @Test
    public void testToString(){

        Ciclo ciclo = new Ciclo("1", "Marcos", new Nivel("Nivel1"), new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706));

        assertEquals("Ciclo {" +
                "codigo='" + ciclo.getCodigo() + '\'' +
                ", nombre='" + ciclo.getNombre() + '\'' +
                ", nivel='" + ciclo.getNivel() + '\'' +
                ", centro='" + ciclo.getCentro() + '\'' +
                "}", ciclo.toString());
    }
}
