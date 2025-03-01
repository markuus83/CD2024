package marcos;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FibonacciTest {
    
    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "3, 2",
        "4, 3",
        "5, 5",
        "6, 8",
        "7, 13",
        "8, 21",
        "9, 34",
        "10, 55"
    })
    void testFibonacci(int input, int expected) {
        assertEquals(expected, Fibonacci.fib(input));
    }

    
    @Test
    public void testBubbleSortEdgeCases() {
        int[] vacio = {};
        int[] esperado = {};
        assertArrayEquals(esperado, Fibonacci.bubbleSort(vacio));

        int[] unElemento = {5};
        int[] esperado2 = {5};
        assertArrayEquals(esperado2, Fibonacci.bubbleSort(unElemento));

        int[] ordenado = {1, 2, 3, 4, 5};
        int[] esperado3 = {1, 2, 3, 4, 5};
        assertArrayEquals(esperado3, Fibonacci.bubbleSort(ordenado));

        int[] inverso = {5, 4, 3, 2, 1};
        int[] esperado4 = {1, 2, 3, 4, 5};
        assertArrayEquals(esperado4, Fibonacci.bubbleSort(inverso));

        int[] duplicado = {3, 1, 2, 3, 1};
        int[] esperado5= {1, 1, 2, 3, 3};
        assertArrayEquals(esperado5, Fibonacci.bubbleSort(duplicado));
    }

}