package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class continuous_Sum {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        List<Integer> sequence = new ArrayList<>();
        int[] dp = new int[n];

        String line = bf.readLine();

        StringTokenizer str = new StringTokenizer(line);

        while(str.hasMoreTokens()) {
            sequence.add(Integer.parseInt(str.nextToken()));
        }

        for(int i = 0; i < n; i++) {

            if(i == 0) dp[i] = sequence.get(i);
            else {
                dp[i] = Math.max((dp[i -1] + sequence.get(i)), sequence.get(i));
            }
        }

        System.out.println(Arrays.stream(dp).max().getAsInt());

    }
}
