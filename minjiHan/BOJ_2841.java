import java.io.*;
import java.util.*;

public class Main {
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String cmd = br.readLine();
        StringTokenizer st = new StringTokenizer(cmd);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Stack<Integer>[] stacks = new Stack[7];
        for(int i = 1; i< 7 ; i++) {
            stacks[i] = new Stack<>();
        }
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken());

            if(stacks[N].isEmpty() || (!stacks[N].isEmpty() && stacks[N].peek() < P)) {
                stacks[N].push(P);
                cnt++;
                continue;
            }
            while(!stacks[N].isEmpty() && stacks[N].peek() > P) {
                stacks[N].pop();
                cnt++;
            }
            if(stacks[N].isEmpty() || (!stacks[N].isEmpty() && stacks[N].peek() != P)) {
                stacks[N].push(P);
                cnt++;
            }
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}