// 개수 세기
//https://www.acmicpc.net/problem/10807

//총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
//예제입력
//11
//1 4 1 2 4 2 4 2 3 4 4
//2
//
//예제 출력 1
//3

import java.util.Arrays;
import java.util.Scanner;

public class Practice5 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int x = sc.nextInt();

        int answer = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).filter(e -> e == x).toArray().length;

        System.out.println(answer);
    }
}
