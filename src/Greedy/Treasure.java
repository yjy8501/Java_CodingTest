package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Treasure {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int sum = 0;

        StringTokenizer stA = new StringTokenizer(bf.readLine());
        StringTokenizer stB = new StringTokenizer(bf.readLine());

        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        while(stA.hasMoreTokens()) {
            A.add(Integer.parseInt(stA.nextToken()));
            B.add(Integer.parseInt(stB.nextToken()));
        }

        Collections.sort(A);
        B.sort(Collections.reverseOrder());

        for(int i = 0; i < N; i++) {
            sum += A.get(i) * B.get(i);
        }

        System.out.println(sum);
    }
}
