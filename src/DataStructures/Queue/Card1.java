package DataStructures.Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Card1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        List<Integer> queue = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while(!queue.isEmpty()) {
            sb.append(queue.remove(0) +" ");
            if(queue.isEmpty()) break;
            queue.add(queue.remove(0));
        }

        System.out.println(sb);
    }
}
