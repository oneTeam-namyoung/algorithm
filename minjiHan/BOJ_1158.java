
import java.io.*;
import java.util.*;

public class Main {
    public static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<Player> playerList = new LinkedList<Player>();

        for (int i = 0; i < n; i++) {
            playerList.add(new Player(i + 1));
        }
        sb.append("<");
        while (playerList.size() > 1) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    sb.append(playerList.poll().index + ", ");
                    break;
                }
                playerList.add(playerList.poll());
            }

        }
        sb.append(playerList.poll().index + ">");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    static class Player {
        public final int index;

        public Player(int index) {
            this.index = index;
        }
    }
}
