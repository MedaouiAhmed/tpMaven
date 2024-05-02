package com.example.tests;

import com.example.myproject.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the Calculator class.
 */
public class CalculatorTest {

	/**
     * Test for the add method of Calculator.
     */
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    /**
     * Test for the subtract method of Calculator.
     */
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }

    /**
     * Test for the multiply method of Calculator.
     */
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    /**
     * Test for the divide method of Calculator.
     */
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(20, 4);
        assertEquals(5, result);
    }
}
