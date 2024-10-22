//숫자 문자열과 영단어
//https://school.programmers.co.kr/learn/courses/30/lessons/81301

//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"
//
//s	result
//"one4seveneight"	1478
//"23four5six7"	234567
//"2three45sixseven"	234567
//"123"	123

public class Practice2 {
    public static int solution(String s) {
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers.length; i++) {
            s = s.replaceAll(numbers[i], i + "");
        }

        return Integer.parseInt(s);
    }

    public static void main(String[] arg) {
        System.out.println(solution("23four5six7"));
    }
}
