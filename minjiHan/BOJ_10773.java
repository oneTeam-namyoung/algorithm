//제일 마지막으로 입력된 값을 삭제한다 -> stack 사

import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int testCase = scanner.nextInt();
        int result = 0;

        for(int i=0; i<testCase; i++) {
            int num = scanner.nextInt();
            if(num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        //stack에 남아있는 값이 없을때까지 반복
        while(!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);

    }
}
