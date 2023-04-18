package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pinaryNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());

        long[] dp = new long[N + 1];

        for(int i = 1; i < N + 1; i++ ) {
            if(i == 1 || i == 2) dp[i] = 1;
            else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }

        }

        System.out.print(dp[N]);

    }

}
