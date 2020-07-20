package practice01;

import org.junit.Test;

public class StringCalculatorTest
{
    @Test
    public void add()
    {
        StringCalculator strCal = new StringCalculator();
        System.out.println(strCal.add("//,\n1,2,3"));
    }
}