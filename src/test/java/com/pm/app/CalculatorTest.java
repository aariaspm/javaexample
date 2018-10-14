package com.pm.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CalculatorTest extends TestCase {
  private Calculator calculator;
  int num1 = 10;
  int num2 = 5;

  public CalculatorTest(String testName) {
    super(testName);
    this.calculator = new Calculator();
  }

  public static Test suite() {
    return new TestSuite(CalculatorTest.class);
  }

  public void testAdd() {
    int result = calculator.add(num1, num2);
    assertEquals(15, result);
  }

  public void testSubstraction() {
    int result = calculator.substract(num1, num2);
    assertEquals(5, result);
  }

  public void testMultiply() {
    int result = calculator.multiply(num1, num2);
    assertEquals(50, result);
  }

  public void testDivide() {
    int result = calculator.divide(num1, num2);
    assertEquals(2, result);
  }
}
