package step02;

/**
 * 문제점: 메인 메소드 하나에서 모든 메소드를 테스트 하고있다.
 *        프로덕션 코드가 복잡해질수록 메인 메소드의 복잡도도 증가한다.
 * refactor:  테스트코드를 메소드별로 분리한다.
 */
public class CalculatorTest
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();

        System.out.println(cal.add(8,2));
        System.out.println(cal.subtract(8, 2));
        System.out.println(cal.multiply(8, 2));
        System.out.println(cal.divide(8, 2));
    }
}
