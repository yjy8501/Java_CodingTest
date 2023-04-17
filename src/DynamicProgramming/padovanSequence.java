package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class padovanSequence {

    public static long[] padovan() {
        long[] dp = new long[101];

        for(int i = 1; i < 101; i++) {
            if(i <= 3) {
                dp[i] = 1;
            }
            else if(i <= 5) {
                dp[i] = 2;
            }

            else {
                dp[i] = dp[i-1] + dp[i-5];
            }
        }
        return dp;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long[] dp = padovan();

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(bf.readLine());
            System.out.println(dp[N]);

        }
    }
}
