package practice01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest
{
    StringCalculator cal;
    @Before
    public void setup()
    {
        cal  = new StringCalculator();
    }

    // 1. 빈문자열 또는 null을 입력할 경우 0을 반환해야한다.
    @Test
    public void add_empty()
    {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    // 2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
    @Test
    public void add_String_number()
    {
        assertEquals(9, cal.add("9"));
    }

    // 3. 숫자 두개를 쉼표 구분자로 입력할 경우 두 숫자의 합을 반환한다.
    @Test
    public void add_devide_number()
    {
        assertEquals(7, cal.add("3,4"));
    }

    // 4.1. 문자열 한개가 입력되는 경우 split  테스트
    @Test
    public void test_split()
    {
        assertArrayEquals(new String[]{"3"}, "3".split(","));
        assertArrayEquals(new String[]{"4", "5"}, "4,5".split(","));
    }
    

}