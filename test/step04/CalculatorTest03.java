package step04;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CalculatorTest03
{
    private Calculator cal;

    @Before
    public void setup()
    {
        cal = new Calculator();
        System.out.println("before");
    }

    @After
    public void teardown()
    {
        System.out.println("teardown");
    }

    @Test
    public void add()
    {
        assertEquals(12, cal.add(10, 2));
        System.out.println("add");
    }

    @Test
    public void subtract()
    {
        assertEquals(8, cal.subtract(10, 2));
        System.out.println("subtract");
    }

    @Test
    public void multiply()
    {
        assertEquals(20, cal.multiply(10, 2));
        System.out.println("multiply");
    }

    @Test
    public void divide()
    {
        assertEquals(5, cal.divide(10, 2));
        System.out.println("divide");
    }
}