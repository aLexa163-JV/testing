package pro.sry.testing.service;

import org.springframework.stereotype.Service;
import pro.sry.testing.exception.DivisionByZeroException;
import pro.sry.testing.exception.ParameterMissing;

@Service
public class CalculatorService {

    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }

    public Integer plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
        }
        Integer num3 = num1 + num2;
        return num3;
    }

    public Integer minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
        }
        Integer num3 = num1 - num2;
        return num3;
    }

    public Integer multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
        }
        Integer num3 = num1 * num2;
        return num3;
    }

    public Integer divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
        }
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на ноль невозможно");
        }
        Integer num3 = num1 / num2;
        return num3;
    }


}
