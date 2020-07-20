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
        // 빈문자열 또는 null인 경우 0을 반환한다.
        if(text == null) return 0;
        if(text.isEmpty()) return 0;

        String[] nums = text.split(",|:");

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(m.find())
        {
            String customDevide = m.group(1);
            nums = m.group(2).split(customDevide);
        }

        int result = 0;
        for(int i=0; i< nums.length; i++)
        {
            try
            {
                String num = nums[i];
                if(" ".equals(num)) num = "0";
                int number = Integer.parseInt(num);

                if(number < 0)
                {
                    new RuntimeException();
                    break;
                }

                result += number;
            }
            catch (RuntimeException e)
            {
                System.out.println("양수값을 입력해주세요.");
            }
        }

        return result;
    }


}
