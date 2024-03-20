package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Stand_In_Line {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());

        List<Integer> sequence = new LinkedList<>();
        List<Integer> lines = new ArrayList<>();

        st = new StringTokenizer(bf.readLine());

        while(st.hasMoreTokens()) {
            lines.add(Integer.parseInt(st.nextToken()));
        }

        for(int i = N-1; i >= 0; i--) {
            if(i == N-1)
                sequence.add(i+1);
            else {
                int line = lines.get(i);
                sequence.add(line, i+1);
            }
        }
        for(int num : sequence) {
            sb.append(num).append(" ");
        }

        System.out.print(sb);
    }
}
