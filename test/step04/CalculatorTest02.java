package step04;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * assertEquals Junit의 메소드이다.
 * 첫번째 인자값은 예상하는값, 두번째 인자값은 프로덕션 코드를 실행한 결과값이다.
 *
 * 문제점: Calculator 인스턴스 생성하는 코드가 매번 중복된다.
 */
public class CalculatorTest02 {

    @Test
    public void add()
    {
        Calculator cal = new Calculator();
        assertEquals(12, cal.add(10, 2));
    }

    @Test
    public void subtract()
    {
        Calculator cal = new Calculator();
        assertEquals(8, cal.subtract(10, 2));
    }

    @Test
    public void multiply()
    {
        Calculator cal = new Calculator();
        assertEquals(20, cal.multiply(10, 2));
    }

    @Test
    public void divide()
    {
        Calculator cal = new Calculator();
        assertEquals(5, cal.divide(10, 2));
    }
}