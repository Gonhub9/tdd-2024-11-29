package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    @DisplayName("1 + 2 = 3")
    public void testPlus() {
        SimpleCalculatorTest simpleCalculator = new SimpleCalculatorTest();
        int rs = simpleCalculator.plus(1, 2); {

            assertEquals(3, rs);
        }

    }
}
