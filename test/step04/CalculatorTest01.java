package step04;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest01 {

    @Test
    public void add()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 2));
    }

    @Test
    public void subtract()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(10, 2));
    }

    @Test
    public void multiply()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(10, 2));
    }

    @Test
    public void divide()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.divide(10, 2));
    }
}