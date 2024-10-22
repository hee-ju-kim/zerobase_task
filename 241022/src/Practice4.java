//행성 X3
//https://www.acmicpc.net/problem/2830
//
//상근이는 초등학교 졸업 여행으로 외계 행성 X3에 방문했었다. 이 행성에 사는 사람들의 이름은 모두 자연수이다. 행성의 거주민은 모두 서로를 알고 있다. 두 X3인은 그들의 친밀도를 자신의 이름을 이진수로 바꾸어서 계산한다. 두 이름을 이진수로 바꾸고, 자리수가 짧은 쪽을 기준으로 정렬한다. 이때, 두 이진수의 각 자리 아래에 두 자리가 같으면 0을, 다르면 1을 적는다. 이 결과 이진수를 다시 10진수로 바꾸면 그들의 친밀도가 된다.
//
//예를 들어, 10과 19의 친밀도는 25이다.
//
//1 0 0 1 1 = 19
//0 1 0 1 0 = 10
//--------------
//1 1 0 0 1 = 25
//행성의 가치는 이 섬에 있는 모든 친밀도의 합이다. 행성 거주민들의 이름이 주어졌을 때, 행성의 가치를 구하는 프로그램을 작성하시오.
//
//예제 입력 1
//2
//19
//10
//예제 출력 1
//25

import java.util.Scanner;

public class Practice4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmp = arr[i];
            } else {
                tmp += tmp ^ arr[i];
            }
        }

        System.out.println(tmp);
    }
}
