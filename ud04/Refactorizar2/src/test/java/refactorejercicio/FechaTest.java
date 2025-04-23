package refactorejercicio;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Clase FechaTest que contiene pruebas para la clase Fecha.
 */
public class FechaTest {

    private final Fecha fechaCorrecta = new Fecha(20, 6, 2008);
    private final Fecha mesMal1 = new Fecha(21, 0, 3000);
    private final Fecha mesMal2 = new Fecha(21, 13, 3000);
    private final Fecha diaMal1 = new Fecha(0, 11, 2000);
    private final Fecha diaMal2 = new Fecha(32, 11, 2000);
    private final Fecha diaMalNoviembre = new Fecha(31, 11, 2000);
    private final Fecha diaBienDiciembre = new Fecha(31, 12, 2000);
    private final Fecha diaMalFebrero = new Fecha(30, 2, 2008);
    private final Fecha diaBienFebreroBisiesto1 = new Fecha(29, 2, 2008);
    private final Fecha diaBienFebreroBisiesto2 = new Fecha(29, 2, 2000);
    private final Fecha diaMalFebreroBisiesto1 = new Fecha(29, 2, 2007);
    private final Fecha diaMalFebreroBisiesto2 = new Fecha(29, 2, 1900);

    /**
     * Prueba para validar las fechas.
     */
    @Test
    public void testValida() {

        assertTrue(fechaCorrecta.esValida());
        assertFalse(mesMal1.esValida());
        assertFalse(mesMal2.esValida());
        assertFalse(diaMal1.esValida());
        assertFalse(diaMal2.esValida());
        assertFalse(diaMalNoviembre.esValida());
        assertTrue(diaBienDiciembre.esValida());
        assertFalse(diaMalFebrero.esValida());
        assertTrue(diaBienFebreroBisiesto1.esValida());
        assertTrue(diaBienFebreroBisiesto2.esValida());
        assertFalse(diaMalFebreroBisiesto1.esValida());
        assertFalse(diaMalFebreroBisiesto2.esValida());
    }
}
