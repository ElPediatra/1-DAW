package Defecto;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class TestEnterosParametrizados {

    @ParameterizedTest
    @DisplayName("Factorial sin excepciones")
    @CsvSource({ "0, 1",
            "3,6",
            "1,1",
            "20,2432902008176640000" })
    final void testFactorial(long n, long resultado) {
        assertEquals(resultado, Enteros.factorial(n));

    }

    @ParameterizedTest
    @DisplayName("Factorial con excepciones")
    @ValueSource(ints = { -3, -1 })
    final void testFactorial1(int n) {
        assertThrows(IllegalArgumentException.class, () -> Enteros.factorial(n));
    }

    @ParameterizedTest
    @DisplayName("Divisible verdadero")
    @CsvSource({ "18,3",
            "18,1",
            "18,-1",
            "-18,3",
            "18,-3",
            "-18,-3" })
    final void testDivisible(int multiplo, int divisor) {
        assertTrue(Enteros.divisible(multiplo, divisor));
    }

    @ParameterizedTest
    @DisplayName("Divisible falso")
    @CsvSource({ "18,4",
            "-18,4",
            "18,-4",
            "-18,-4" })
    final void testDivisible1(int multiplo, int divisor) {
        assertFalse(Enteros.divisible(multiplo, divisor));
    }

    @ParameterizedTest
    @DisplayName("Divisible con excepcion")
    @CsvSource({ "18,0" })
    final void testDivisible2(int multiplo, int divisor) {
        assertThrows(ArithmeticException.class, () -> Enteros.divisible(multiplo, divisor));
    }

    @ParameterizedTest
    @DisplayName("Son primos")
    @ValueSource(ints = { 3, 5, 7, 2 })
    final void testEsPrimo(int n) {
        assertTrue(Enteros.esPrimo(n));
    }

    @ParameterizedTest
    @DisplayName("No son primos")
    @ValueSource(ints = { 0, 4, -3, 9, 1 })
    final void testEsPrimo1(int n) {
        assertFalse(Enteros.esPrimo(n));
    }

}