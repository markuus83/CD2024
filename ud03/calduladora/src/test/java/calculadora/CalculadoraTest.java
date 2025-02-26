/**
 * Creación de probas PARAMETRIZADAS para a clase calculadora.
 * 
 * Temos de capturar a excepcion nas probas.
 */

package calculadora;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;



public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @ParameterizedTest
    @CsvSource({"1,2,3","-1,-2,-3","0,5,5"})
    void testSumar(int a, int b, int resultadoEsperado){
        assertEquals(resultadoEsperado, calculadora.sumar(a, b));
    }


    @ParameterizedTest
    @CsvSource({"1,2,-1","-1,-2,1","0,5,-5"})
    void testRestar(int a, int b, int resultadoEsperado){
        assertEquals(resultadoEsperado, calculadora.restar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"1,2,2","-1,-2,2","0,5,0"})
    void testMultiplicar(int a, int b, int resultadoEsperado){
        assertEquals(resultadoEsperado, calculadora.multiplicar(a, b));
    }

    @ParameterizedTest
    @CsvSource({"10,2,5","5,0,4", "-3,0,0"})
    void testDividir(int a, int b, int resultadoEsperado){
        if(b != 0){
            assertEquals(resultadoEsperado, calculadora.dividir(a, b));
        }else {
            assertThrows(ArithmeticException.class, () -> calculadora.dividir(a, b));
        }
        
    }

}
