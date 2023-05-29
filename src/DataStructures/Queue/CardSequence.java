package DataStructures.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class CardSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i ++) {
            int N = Integer.parseInt(bf.readLine());

            Deque<String> queue = new ArrayDeque<>();

            StringTokenizer st = new StringTokenizer(bf.readLine());

            StringBuilder sb = new StringBuilder();



            for(int j = 0; j < N; j++) {
                String temp = st.nextToken();

                if(queue.isEmpty()) {
                    queue.addFirst(temp);
                    sb.append(temp);
                }

                else if(queue.peekFirst().compareTo(temp) < 0) {
                    queue.addLast(temp);
                    sb.append(temp);
                }
                else {
                    queue.addFirst(temp);
                    sb.insert(0, temp);
                }
            }

            System.out.println(queue);
            System.out.println(sb);
        }
    }
}
