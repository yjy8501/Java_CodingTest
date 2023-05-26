package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfSquart {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] dp = new int[N+1];

        int limit = (int) Math.sqrt(N);

        for(int i = 1; i <= N; i++) {
            dp[i] = i;
        }

        for(int i = 2; i <= limit; i++) {
            int powNum = (int)Math.pow(i,2);
            for(int j = powNum; j <= N; j++) {
                dp[j] = Math.min(dp[j], dp[j-powNum] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}
