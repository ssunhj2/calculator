package step04;

/**
 * JUnit을 사용한 Test코드
 */
public class CalculatorTest
{
    /** 프로덕션 코드 */
    public static void add()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 2));
    }

    public void subtract()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(10, 2));
    }

    public void multiply()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(10, 2));
    }

    public void divide()
    {
        Calculator cal = new Calculator();
        System.out.println(cal.divide(10, 2));
    }
}
