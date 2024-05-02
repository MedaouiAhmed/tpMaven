package com.example.myproject;

/**
 * This class represents a simple calculator.
 */
public class Calculator {

    /**
     * Adds two numbers.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of the two numbers.
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts two numbers.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The difference between the two numbers.
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
    
    /**
     * Multiplies two numbers.
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of the two numbers.
     */

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides two numbers.
     * @param num1 The first number (dividend).
     * @param num2 The second number (divisor).
     * @return The result of the division.
     */
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
