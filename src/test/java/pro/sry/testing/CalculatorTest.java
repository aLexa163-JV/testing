package pro.sry.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import pro.sry.testing.exception.DivisionByZeroException;
import pro.sry.testing.service.CalculatorService;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    private final CalculatorService calculator = new CalculatorService();


    // Тесты для метода сложения
    @Test
    @DisplayName("Тест сложения")
    void testPlus() {
        assertEquals(7, calculator.plus(1, 6));
        assertEquals(5, calculator.plus(1, 4));
    }

    // Тесты для метода вычитания
    @Test
    @DisplayName("Тест вычитания")
    void testMinus() {
        assertEquals(5, calculator.minus(10, 5));
        assertEquals(4, calculator.minus(5, 1));
    }

    // Тесты для метода умножения
    @Test
    @DisplayName("Тест умножения")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(8, calculator.multiply(2, 4));
    }

    // Тесты для метода деления
    @Test
    @DisplayName("Тесты деления")
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(3, calculator.divide(12, 4));
    }

    // Тест для проверки выбрасывания исключения при делении на ноль
    @Test
    @DisplayName("Исключения при делении на ноль")
    void testDivideByZero() {
        // Проверяем, что при делении на ноль выбрасывается исключение DivisionByZeroException
        Exception exception = assertThrows(DivisionByZeroException.class, () -> {
            calculator.divide(1, 0);
        });
        // Проверяем сообщение исключения
        assertEquals("Деление на ноль невозможно", exception.getMessage());
    }

}
