package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fibonacci_Function {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());

        int[] dp = new int[41];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i < 41; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            if(N == 0) System.out.println(dp[1]+" "+dp[0]);
            else System.out.println(dp[N-1]+" "+dp[N]);

        }
    }
}
