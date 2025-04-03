package javadoc2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CirculoTest {

    private double cero = 0.0;
    private int menosUno = -1;
    private int uno = 1;
    private int dos = 1;
    private int tres = 1;
    private int seis = 6;
    private int diez = 10;
    private int veinte = 20;
    private int treinta = 30;

    @Test
    public void testConstructorAndGetters() {

        Circulo circulo = new Circulo(uno, dos, tres);

        assertEquals(uno, circulo.obtenerX());
        assertEquals(dos, circulo.obtenerY());
        assertEquals(tres, circulo.obtenerRadio());
    }

    @Test
    public void testSetters() {

        Circulo circulo = new Circulo(uno, dos, tres);

        circulo.establecerX(diez);
        circulo.establecerY(veinte);
        circulo.establecerRadio(treinta);

        assertEquals(diez, circulo.obtenerX());
        assertEquals(veinte, circulo.obtenerY());
        assertEquals(treinta, circulo.obtenerRadio());

        // Valores negativos del radio
        circulo.establecerRadio(menosUno);
        assertEquals(cero, circulo.obtenerRadio());
    }

    @Test
    public void testObtenerDiametro() {

        Circulo circulo = new Circulo(uno, dos, tres);

        assertEquals(seis, circulo.obtenerDiametro());
    }

    @Test
    public void testObtenerCircunferencia() {

        Circulo circulo = new Circulo(uno, dos, tres);

        assertEquals(Math.PI * seis, circulo.obtenerCircunferencia());
    }

    @Test
    public void testObtenerArea() {

        Circulo circulo = new Circulo(uno, dos, tres);

        assertEquals(Math.PI * tres * tres, circulo.obtenerArea());
    }

    @Test
    public void testToString() {

        Circulo circulo = new Circulo(uno, dos, tres);

        assertEquals(
                "Centro = [" + circulo.obtenerX() + "," + circulo.obtenerY() + "]; Radio = " + circulo.obtenerRadio(),
                circulo.toString());
    }
}
