package javadoc2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CirculoTest {
    
    @Test
    public void testConstructorAndGetters(){

        Circulo circulo = new  Circulo(1, 2, 3);

        assertEquals(1, circulo.obtenerX());
        assertEquals(2, circulo.obtenerY());
        assertEquals(3, circulo.obtenerRadio());
    }

    @Test
    public void testSetters(){

        Circulo circulo = new  Circulo(1, 2, 3);

        circulo.establecerX(10);
        circulo.establecerY(20);
        circulo.establecerRadio(30);

        assertEquals(10, circulo.obtenerX());
        assertEquals(20, circulo.obtenerY());
        assertEquals(30, circulo.obtenerRadio());

        //Valores negativos del radio
        circulo.establecerRadio(-1);
        assertEquals(0.0, circulo.obtenerRadio());
    }


    @Test
    public void testObtenerDiametro(){

        Circulo circulo = new  Circulo(1, 2, 3);

        assertEquals(6, circulo.obtenerDiametro());

    }


    @Test
    public void testObtenerCircunferencia(){

        Circulo circulo = new  Circulo(1, 2, 3);

        assertEquals(Math.PI * 6, circulo.obtenerCircunferencia());

    }


    @Test
    public void testObtenerArea(){

        Circulo circulo = new  Circulo(1, 2, 3);

        assertEquals(Math.PI * 3 * 3, circulo.obtenerArea());

    }


    @Test
    public void testToString(){

        Circulo circulo = new  Circulo(1, 2, 3);

        assertEquals("Centro = [" + circulo.obtenerX() +
                    ","+circulo.obtenerY()+
                    "]; Radio = " + circulo.obtenerRadio(), 
                    circulo.toString());
    }
}