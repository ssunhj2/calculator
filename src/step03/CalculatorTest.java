package step03;

/**
 * 문제점1: 보통 개발을 진행할때 구현하고 있는 메소드 하나에만 집중한다.
 *        그런데 이 코드는 Calculator 클래스가 가진 모든 메소드를 테스트한다.
 * 문제점2: 아래 코드는 간단하지만, 복잡한 코드인 경우 결과값을 예측하기가 어렵다.
 *        결과를 확인하려면 테스트 결과를 콘솔에 찍어 확인해야하는 번거로움이 다.
 *        많은 시간이 지난 후에 보면 다시 로직을 머리속으로 계산해 결과가 맞는지 일일이 확인해야한다.
 *
 * refactor: JUnit을 사용한다. JUnit으로 내가 원하는 메소드만 테스트 하는게 가능하다.
 *           또한 결과값 확인을 프로그래밍을 통화 자동화하는것이 가능하다.
 */
public class CalculatorTest
{
    public static void main(String[] args)
    {
        Calculator cal = new Calculator();

        add(cal);
        subtract(cal);
        multiply(cal);
        divide(cal);
    }

    private static void add(Calculator cal)
    {
        System.out.println(cal.add(8,2));
    }

    private static void subtract(Calculator cal)
    {
        System.out.println(cal.subtract(8, 2));
    }

    private static void multiply(Calculator cal)
    {
        System.out.println(cal.multiply(8, 2));
    }

    private static void divide(Calculator cal)
    {
        System.out.println(cal.divide(8, 2));
    }
}
