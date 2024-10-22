//괄호
//https://www.acmicpc.net/problem/9012

//예제 입력
//1
//6
//(())())
//(((()())()
//(()())((()))
//((()()(()))(((())))()
//()()()()(()()())()
//(()((())()(
//예제 출력 1
//NO
//NO
//YES
//NO
//YES
//NO

import java.util.Scanner;
import java.util.Stack;

public class Practice3 {
    public static void main (String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        sc.close();

        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < arr.length; j++) {
            boolean check = true;
            for (int i = 0; i < arr[j].length(); i++) {
                if (arr[j].charAt(i) == '(') {
                    stack.push('(');
                } else {
                    if (stack.isEmpty()) {
                        check = false;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (check && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            stack.clear();
        }
    }
}
