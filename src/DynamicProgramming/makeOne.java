package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class makeOne {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        int[] dp = new int[N+1];


        for(int i = 2; i <= N; i++) {

            if(N <= 3 ){
                dp[i] = 1;
                continue;
            }
            dp[i] = dp[i-1] + 1;

            if(i % 3 == 0) {
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            }
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }



        }
        System.out.println(dp[N]);
    }
}
