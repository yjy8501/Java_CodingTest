package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        long[] dp = new long[N+1];

        for(int i = 1; i <= N; i++) {
            if(i == 1 || i == 2) {
                dp[i] = 1;
            }
            else {
                dp[i] = (dp[i-1] + dp[i-2]) % 1000000007;
            }
        }

        System.out.println(dp[N]);
    }
}
