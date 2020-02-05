package org.oose.dea;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
        assertEquals(100, calculator.add(25, 75));
    }

    @Test
    public void testMinus() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.minus(4, 2));
        assertEquals(100, calculator.minus(125, 25));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(10, calculator.divide(100, 10));
    }

    @Test
    public void testTimes() {
        Calculator calculator = new Calculator();
        assertEquals(250, calculator.times(50, 5));
        assertEquals(20, calculator.times(2, 10));
    }
}
