package marcos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CentroTest {
  
     Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

    @Test
    public void testConstructorAndGetters(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        assertEquals(1, centro.getCodigo());
        assertEquals("San Clemente", centro.getNombre());
        assertEquals("Santiago de Compostela", centro.getLocalidad());
        assertEquals("Rúa San Clemente", centro.getCalle());
        assertEquals("1", centro.getNumero());
        assertEquals(15706, centro.getCodigoPostal());
    }

    @Test
    public void testSetCodigo(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setCodigo(2);
        assertEquals(2, centro.getCodigo());
    }

    @Test
    public void testSetNombre(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setNombre("Miau");
        assertEquals("Miau", centro.getNombre());
    }

    @Test
    public void testSetLocalidad(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setLocalidad("Bilbao");
        assertEquals("Bilbao", centro.getLocalidad());
    }

    @Test
    public void testSetCalle(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setCalle("Catedral");
        assertEquals("Catedral", centro.getCalle());
    }

    @Test
    public void testSetNumero(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setNumero("10");
        assertEquals("10", centro.getNumero());
    }

    @Test
    public void testSetCodigoPostal(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        centro.setCodigoPostal(2020);
        assertEquals(2020, centro.getCodigoPostal());
    }

    @Test
    public void testGetDireccion(){

        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        assertEquals(centro.getLocalidad() + ": " + centro.getCalle() + " - " + centro.getNumero() + " || " + centro.getCodigoPostal(), centro.getDireccion());
    }

    @Test
    public void testToString(){
        Centro centro = new Centro(1, "San Clemente", "Santiago de Compostela", "Rúa San Clemente", "1", 15706);

        assertEquals("Centro {" +
                "codigo='" + centro.getCodigo() + '\'' +
                ", nombre='" + centro.getNombre() + '\'' +
                ", direccion='" + centro.getDireccion() + '\'' +
                "}", centro.toString());
    }
}
