package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Sorting {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        long [] sort = new long[N+1];
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        long result = 0;

        for(int i = 1; i <= N; i++) {
            int input = Integer.parseInt(bf.readLine());

            if(sort[input] != 0) {
                queue.add(input);
            }
            else {
                sort[input] = input;
            }
        }

        for(int i = 1; i <= N; i++) {
            if(sort[i] == 0) {
                result += Math.abs(i - queue.poll());
            }
        }

        System.out.print(result);
    }
}