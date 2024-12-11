package pro.sry.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sry.testing.exception.ParameterMissing;
import pro.sry.testing.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("")
    public String calculator() {

        return calculatorService.calculator();
    }

    @GetMapping("/plus")
    public Integer plus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2)
            throws ParameterMissing {
        String s = "Параметр отсутствует";

        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public Integer minus(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2)
            throws ParameterMissing {
        String s = "Параметр отсутствует";

        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public Integer multiply(@RequestParam(value = "num1", required = false) Integer num1,
                            @RequestParam(value = "num2", required = false) Integer num2)
            throws ParameterMissing {
        String s = "Параметр отсутствует";

        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public Integer divide(@RequestParam(value = "num1", required = false) Integer num1,
                          @RequestParam(value = "num2", required = false) Integer num2)
            throws ParameterMissing {
        String s = "Параметр отсутствует";

        return calculatorService.divide(num1, num2);
    }
}
