package pro.sry.testing.service;

import org.springframework.stereotype.Service;
import pro.sry.testing.exception.DivisionByZeroException;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение!";
        }
        int num3 = num1 + num2;
        return num1 + " + " + num2 + " = " + num3;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение!";
        }
        int num3 = num1 - num2;
        return num1 + " - " + num2 + " = " + num3;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение!";
        }
        int num3 = num1 * num2;
        return num1 + " * " + num2 + " = " + num3;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Введите значение!";
        }
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль невозможно");
        }
        Integer num3 = num1 / num2;
        return num1 + " / " + num2 + " = " + num3;
    }


}
