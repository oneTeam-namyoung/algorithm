/*
-> 순서뒤집기.. R이 입력되면 어디서 부터 뽑을지만 결정
removeFirst() : 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다.
pollFirst() : 덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다.
removeLast() : 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다.
pollLast() : 덱의 마지막 쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 null 이 리턴된다.
remove() : removeFirst()와 동일
poll() : pollFirst()와 동일
 */

import java.io.*;
import java.util.*;

public class Main {
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            bw.write(testCase());
            if(i < testCase - 1) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

    private static String testCase() throws IOException {
        String cmd = br.readLine();
        int len = Integer.parseInt(br.readLine());
        String arr = br.readLine().replace("[", "").replace("]", "").replace(",", " ");
        Deque<Integer> deque = new LinkedList<>();
        StringTokenizer st = new StringTokenizer(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            deque.add(Integer.parseInt(st.nextToken()));
        }

        boolean isReverse = false;
        for (int i = 0; i < cmd.length(); i++) {
            if (cmd.charAt(i) == 'R') {
                isReverse = !isReverse;
            } else if (cmd.charAt(i) == 'D' && !deque.isEmpty()) {
                if (!isReverse) {
                    deque.removeFirst();
                } else {
                    deque.removeLast();
                }
            } else {
                return "error";
            }
        }

        sb.append("[");
        while (!deque.isEmpty()) {
            if (!isReverse) {
                sb.append(deque.removeFirst());
            } else {
                sb.append(deque.removeLast());
            }

            if (deque.size() > 0) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}