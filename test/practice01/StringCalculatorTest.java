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

    // 3.1 숫자 두개를 쉼표 구분자로 입력할 경우 두 숫자의 합을 반환한다.
    @Test
    public void add_devide_number()
    {
        assertEquals(7, cal.add("3,4"));
    }

    // 3.2. 문자열 한개가 입력되는 경우 split  테스트
    @Test
    public void test_split()
    {
        assertArrayEquals(new String[]{"3"}, "3".split(","));
        assertArrayEquals(new String[]{"4", "5"}, "4,5".split(","));
    }

    // 3.6. 쉼표(,) 이외에 콜론(:)으로 문자열을 구분할 수 있도록 처리한다.
    @Test
    public void add_devide_number2()
    {
        assertEquals(12, cal.add("3,4:5"));
    }

    // 3.7. //와 \n 문자 사이에 커스텀 구분자를 지정할 수 있다.
    @Test
    public void add_devide_number3()
    {
        assertEquals(12, cal.add("//-\n3-4-5"));
    }

    // 3.8. 음수가 전달되는 경우 RuntimeException 예외를 throw 한다.
    @Test(expected = RuntimeException.class)
    public void add_number_exception() throws Exception
    {
        cal.add("-5,4,3");
    }

}