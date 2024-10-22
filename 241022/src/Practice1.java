//짝수는 싫어요
//https://school.programmers.co.kr/learn/courses/30/lessons/120813?language=java

import java.util.Arrays;
import java.util.stream.IntStream;


//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
//
//n	result
//10	[1, 3, 5, 7, 9]
//15	[1, 3, 5, 7, 9, 11, 13, 15]


public class Practice1 {
    public static int[] solution(int n) {
//        int[] arr = new int[(int)(n + 1) / 2];
//        int index = 0;
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 != 0) {
//                arr[index] = i;
//                index++;
//            }
//        }
//        return Arrays.toString(arr);

        return IntStream.rangeClosed(0, n).filter(e -> e % 2 != 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15)));

    }
}

