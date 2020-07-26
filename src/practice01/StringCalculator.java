package practice01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. 전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환한다.
 * 2. 구분자는 , 또는 : 이다.
 * 3. 구분자 , 와 : 외에 커스텀 구분자를 지정 가능해야한다.
 *    커스텀 구분자는 문자열 앞부분의 ₩₩와 ₩n 사이에 위치하는 문자를 커스텀 구분자로 사용한다.
 *    ex) ₩₩;₩n1;2;3인 경우 커스텀 구분자는 ; 이다.
 * 4. 계산기에 음수를 전달하는 경우 RuntimeException으로 예외처리한다.
 */
public class StringCalculator
{
    // 1. 구분자(, 또는 :)로 구분한 문자열을 전달하는 경우 구분자를 기준으로 각 숫자를 분리한다.
    // 2. 분리한 각 숫자의 합을 반환한다.
    // 3. 빈 문자열인 경우 0을 반환한다.
    int add(String text)
    {
        // 1. 빈문자열 또는 null을 입력할 경우 0을 반환해야한다.
        //if(text == null || text.isEmpty()) return 0;

        // 3.5. 빈문자열 또는 null인지 확인하는 메소드를 분리한다.
        if(isBlank(text)) return 0;

        // 3.1 숫자 두개를 쉼표 구분자로 입력할 경우 두 숫자의 합을 반환한다.
        // if(text.contains(","))
        // 3.2. 구분자 없이 문자열 한개가 입력되는 경우 split 적용하면 0번째 index에 담긴다.
        String[] values = text.split(",");

        return sum(toInts(values));

        // 3.4. 문자를 숫자로 바꾸는 메소드를 분리한다.
        // return sum(values);
        // 2. 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.
        //return Integer.parseInt(text);

    }

    // 3.3. 숫자의 합을 구하는 메소드를 분리한다.
    /*private int sum(String[] values)
    {
        int sum = 0;

        for (String value : values)
        {
            sum += Integer.parseInt(value);
        }

        return sum;
    }*/
    // 3.4. 문자를 숫자로 바꾸는 메소드를 분리한다.
    private int sum(int[] numbers)
    {
        int sum = 0;

        for (int number : numbers)
        {
            sum += number;
        }

        return sum;
    }

    // 3.4. 문자를 숫자로 바꾸는 메소드를 분리한다.
    private int[] toInts(String[] values)
    {
        int[] numbers = new int[values.length];

        for (int i = 0; i < values.length ; i++)
        {
            numbers[i] = Integer.parseInt(values[i]);
        }

        return numbers;
    }

    // 3.5. 빈문자열 또는 null인지 확인하는 메소드를 분리한다.
    private boolean isBlank(String text)
    {
        return text == null || text.isEmpty();
    }

}
