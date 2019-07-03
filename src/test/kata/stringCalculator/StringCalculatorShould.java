package test.kata.stringCalculator;

import com.kata.stringCalculator.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorShould {


    private StringCalculator stringCalculator;

    @BeforeEach
    public void init_calculator() {
         stringCalculator = new StringCalculator();
    }

    @Test
    public void string_calculator_should_sum_string() {
        Assertions.assertEquals(0, stringCalculator.add(""));
        Assertions.assertEquals(4, stringCalculator.add("4"));
        Assertions.assertEquals(3, stringCalculator.add("1,2"));
    }

    @Test
    public void string_calculator_should_sum_multiple_numbers() {
        Assertions.assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
    }

    @Test
    public void string_calculator_should_separate_numbers_by_line_break() {
        Assertions.assertEquals(6, stringCalculator.add("1\n2,3"));
    }

    @Test
    public void string_calculator_separates_by_custom_separators() {
        Assertions.assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
}
