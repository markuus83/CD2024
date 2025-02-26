/**
 * Creación de probas PARAMETRIZADAS para a clase calculadora.
 * 
 * Temos de capturar a excepcion nas probas.
 */

package calculadora;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import  org.junit.jupiter.api.Assertions.assertTrue;
import  org.junit.jupiter.api.Assertions.assertEquals;



public class CalculadoraTest {

    @ParameterizedTest
    @Csv
    void sumar(){
        assertEquals(2, Calculadora.sumar());
    }
}