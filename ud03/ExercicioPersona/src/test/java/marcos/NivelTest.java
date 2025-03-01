package marcos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NivelTest {
    
    @Test
    public void testConstructorAndGetters() {

        Nivel nivel = new Nivel("1");

        assertEquals("1", nivel.getNivel());
    }

    @Test
    public void testSetNivel(){
        
        Nivel nivel = new Nivel("1");

        nivel.setNivel("2");
        assertEquals("2", nivel.getNivel());
    }

    @Test
    public void testToString(){
        
        Nivel nivel = new Nivel("1");

        assertEquals("Nivel {" +
                    "nivel='" + nivel.getNivel() + '\'' +
                    "}", nivel.toString());
    }
}
