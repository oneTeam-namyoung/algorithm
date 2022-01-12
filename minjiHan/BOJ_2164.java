//데이터를 제거하는 순서가 선입선출 즉, queue를 사용하는 문

import java.io.*;
import java.util.*;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> cardList = new LinkedList<>();
        int count = scanner.nextInt();

        for(int i=0 ; i<count; i++) {
            cardList.add(i+1);
        }
        
        //size가 2일때까지 반복
        while(cardList.size() > 1) {
            cardList.poll();
            cardList.add(cardList.poll());
        }

        int result = cardList.peek();
        System.out.println(result);

    }
}
