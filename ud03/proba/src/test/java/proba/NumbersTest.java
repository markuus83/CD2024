package proba;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {1,3,5,-3,15, Integer.MAX_VALUE})

    void isOdd_ShouldReturnTrueForOddNumbers(int number){
        assertTrue(Numbers.isOdd(number));
    }
    
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,-2,16, Integer.MIN_VALUE})
    void isOdd_ShouldReturnFalseForEvenNumbers(int number){
        assertTrue(!Numbers.isOdd(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {0})
    void isOdd_ShouldReturnFalseForZero(int number){
        assertTrue(!Numbers.isOdd(number));
    }
}