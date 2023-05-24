package DataStructures.PriorityQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class N_BigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        int N = Integer.parseInt(bf.readLine());

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            while(st.hasMoreTokens()) {
                queue.add(Integer.parseInt(st.nextToken()));
            }
        }

        for(int i = 1; i < N; i++) {
            queue.poll();
        }

        System.out.println(queue.poll());
    }
}
