package step01;

/**
 * 문제점:  프로덕션코드와 테스트코드가 같은 클래스에 위치하고 있다.
 *       테스트코드는 테스트할때만 필요하므로 프로덕션 코드와 같이 배포할 필요가 없다.
 * refector: 프로덕션 코드와 테스트 코드를 분리한다.
 */
public class Calculator
{
    /** 프로덕션 코드 */
    int add(int i, int j)
    {
        return i + j;
    }

    int subtract(int i, int j)
    {
        return i - j;
    }

    int multiply(int i, int j)
    {
        return i * j;
    }

    int divide(int i, int j)
    {
        return i / j;
    }

    /** 테스트 코드 */
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        System.out.println(cal.add(7, 4));
        System.out.println(cal.subtract(9,6));
        System.out.println(cal.multiply(2, 7));
        System.out.println(cal.divide(10, 2));
    }

}

