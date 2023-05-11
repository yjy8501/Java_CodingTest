package DataStructures.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class JosephusSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            Collections.rotate(queue, -(K-1));
            result.add(queue.remove(0));
        }

        System.out.println(result.toString().replaceAll("\\[","<").replaceAll("]", ">"));

    }
}
