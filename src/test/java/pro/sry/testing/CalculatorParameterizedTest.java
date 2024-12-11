package pro.sry.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.sry.testing.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParameterizedTest {

    private final CalculatorService calculatorService = new CalculatorService();

    // Параметризованный тест для метода сложения
    @ParameterizedTest
    @DisplayName("Параметризованный тест сложения")
    @CsvSource({
            "5, 5, 10",
            "2, 1, 3",
            "4, 0, 4",
            "10, 2, 12"
    })
    void testPlus(int a, int b, int expected) {
        assertEquals(expected, calculatorService.plus(a, b));
    }

    // Параметризованный тест для метода вычитания
    @ParameterizedTest
    @DisplayName("Параметризованный тест вычитания")
    @CsvSource({
            "10, 5, 5",
            "6, 5, 1",
            "0, 0, 0",
            "4, 2, 2"
    })
    void testMinus(int a, int b, int expected) {
        assertEquals(expected, calculatorService.minus(a, b));
    }

    // Параметризованный тест для метода умножения
    @ParameterizedTest
    @DisplayName("Параметризованный тест умножения")
    @CsvSource({
            "4, 5, 20",
            "2, 3, 6",
            "0, 5, 0",
            "2, 2, 4"
    })
    void testMultiply(int a, int b, int expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    // Параметризованный тест для метода деления
    @ParameterizedTest
    @DisplayName("Параметризованный тест деления")
    @CsvSource({
            "10, 5, 2",
            "9, 3, 3",
            "8, 4, 2",
            "0, 5, 0"
    })
    void testDivide(int a, int b, int expected) {
        assertEquals(expected, calculatorService.divide(a, b));
    }
}
