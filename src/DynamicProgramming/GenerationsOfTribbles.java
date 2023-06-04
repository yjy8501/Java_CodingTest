package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerationsOfTribbles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine());
        long[] dp = new long[68];

        for(int i = 0; i < 68; i++) {
            if(i < 2)
                dp[i] = 1;
            else if(i == 2)
                dp[i] = 2;
            else if(i == 3)
                dp[i] = 4;
            else {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3] + dp[i - 4];
            }
        }

        for(int i = 0; i < T; i++) {
            int n = Integer.parseInt(bf.readLine());

            System.out.println(dp[n]);
        }
    }
}
